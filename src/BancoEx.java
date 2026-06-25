import java.util.Scanner;

public class BancoEx {

    public static void main(String[] args) {

        System.out.println("Deseja criar uma conta? S/N");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite seu nome: ");
            var nome = sc.nextLine();
            System.out.print("Digite o valor inicial que deseja depositar: ");
            var valorInicial = sc.nextDouble();
            double cheque;
            if (valorInicial <= 500){
                cheque = 50;
            } else cheque = valorInicial / 2;

            Conta novaConta = new Conta(valorInicial, cheque);
            var opcao = 1;

            do {
                System.out.println("Quais opções você deseja Sr. " + nome + "?");
                System.out.println("1 - Consultar saldo.");
                System.out.println("2 - Consultar cheque especial.");
                System.out.println("3 - Depositar dinheiro.");
                System.out.println("4 - Sacar Dinheiro.");
                System.out.println("5 - Pagar Boleto.");
                System.out.println("6 - Verificar se a conta tem cheque especial.");
                System.out.println("7 - Sair");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Saldo: R$" + novaConta.getSaldo());
                        System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                        opcao = sc.nextInt();
                        continue;
                    case 2:
                        System.out.println("Cheque Especial: R$" + novaConta.getChequeEsp());
                        System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                        opcao = sc.nextInt();
                        continue;
                    case 3:
                        System.out.print("Quanto deseja depositar? R$");
                        double valorDepositado = sc.nextDouble();
                        novaConta.depositar(valorDepositado);
                        System.out.println("Pronto! Saldo atual de: R$" + novaConta.getSaldo());
                        System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                        opcao = sc.nextInt();
                        continue;
                    case 4:
                        System.out.print("Quanto deseja sacar? R$");
                        double valorSacar = sc.nextDouble();
                        if (valorSacar <= novaConta.getSaldo()) {
                            novaConta.sacar(valorSacar);
                            System.out.println("Pronto! Saldo atual de: R$" + novaConta.getSaldo());
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        } else {
                            System.out.println("Saldo insuficiente!");
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        }
                        continue;
                    case 5:
                        System.out.print("Qual o valor do boleto? R$");
                        double valorBoleto = sc.nextDouble();
                        var saldoTotal = novaConta.getSaldo() + novaConta.getChequeEsp();
                        if (valorBoleto <= novaConta.getSaldo()) {
                            novaConta.sacar(valorBoleto);
                            System.out.println("Pronto! Saldo atual de: R$" + novaConta.getSaldo());
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        } else if (valorBoleto > saldoTotal) {
                            System.out.println("Crédito insuficiente!");
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        } else {
                            novaConta.sacar(valorBoleto);
                            System.out.println("Pronto! Cheque Especial utilizado no pagamento!");
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        }
                        continue;
                    case 6:
                        if (novaConta.getChequeEsp() <= 0) {
                            System.out.println("Essa conta não possui Cheque Especial.");
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        } else {
                            System.out.println("Essa conta possui Cheque Especial no valor de: R$" + novaConta.getChequeEsp());
                            System.out.println("Se desejar voltar ao menu digite 1, se preferir sair, digite 7: ");
                            opcao = sc.nextInt();
                        }
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 7);

        } else System.out.println("Tenha um ótimo dia!");



    }
}