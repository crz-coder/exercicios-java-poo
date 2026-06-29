import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Registro de Ingressos:");
        System.out.print("Nome do filme: ");
        String nome = sc.nextLine();
        System.out.print("Preço do Ingresso: R$");
        double preco = sc.nextDouble();
        sc.nextLine();
        System.out.print("Dublado ou Legendado?: ");
        String dub = sc.nextLine();
        while (!dub.equalsIgnoreCase("legendado") &&  !dub.equalsIgnoreCase("dublado")){
                System.out.println("Inválido, tente novamente: ");
                System.out.print("Dublado ou Legendado?: ");
                dub = sc.nextLine();
        }
        boolean dublagem = true;
        if (dub.equalsIgnoreCase("legendado")){
            dublagem = false;
        } else {
            dublagem =  true;
        }
        System.out.print("Quantas Pessoas?: ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        while (numPessoas < 1) {
            System.out.println("Número inválido, tente novamente: ");
            numPessoas = sc.nextInt();
            sc.nextLine();
        }

        Ingresso ingresso1 = new Ingresso(nome, preco, dublagem);
        MeiaEntrada ingresso2 = new MeiaEntrada(nome, preco, dublagem);
        PacoteFamilia ingresso3 = new PacoteFamilia(nome, numPessoas, preco, dublagem);

        System.out.println();
        System.out.println("Ingresso criado com sucesso!");
        System.out.println("Filme: " + ingresso1.getNome());
        System.out.printf("Preço do Ingresso Individual: R$%.2f\n", ingresso1.getValorFinal());
        System.out.println("Preço da Meia Entrada: R$" + ingresso2.getValorFinal());
        if (numPessoas > 1) {
            System.out.println("Preço do Pacote Família (" + ingresso3.getNumPessoas() + " pessoas): R$" + ingresso3.getValorFinal());
        }
        System.out.println("Dublado ou Legendado?: " + ingresso1.getDublagem());
    }
}