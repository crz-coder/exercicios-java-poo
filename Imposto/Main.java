import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Registro de Compra");
        System.out.print("Digite o nome do produto: ");
        Scanner sc = new Scanner(System.in);
        var nome = sc.nextLine();
        System.out.print("Digite a quantidade: ");
        var quantidade = sc.nextInt();
        System.out.print("Digite o valor do produto: R$");
        var valor = sc.nextDouble();
        var valorFinal = valor * quantidade;

        Impostos alimentacao = total -> valorFinal + (valorFinal * 0.01);
        Impostos saude = total -> valorFinal + (valorFinal * 0.015);
        Impostos vestuario = total -> valorFinal + (valorFinal * 0.025);
        Impostos cultura = total -> valorFinal + (valorFinal * 0.04);

        System.out.println("\nSelecione o tipo de produto:");
        System.out.println("Alimentação - 1");
        System.out.println("Saúde e bem estar - 2");
        System.out.println("Vestuário - 3");
        System.out.println("Cultura - 4");
        var opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.printf("\nProduto: %s\nQuantidade: %s", nome, quantidade);
                System.out.printf("\nValor final: R$%.2f", alimentacao.calcular(valorFinal));
                break;
            case 2:
                System.out.printf("\nProduto: %s\nQuantidade: %s", nome, quantidade);
                System.out.printf("\nValor final: R$%.2f", saude.calcular(valorFinal));
                break;
            case 3:
                System.out.printf("\nProduto: %s\nQuantidade: %s", nome, quantidade);
                System.out.printf("\nValor final: R$%.2f", vestuario.calcular(valorFinal));
                break;
            case 4:
                System.out.printf("\nProduto: %s\nQuantidade: %s", nome, quantidade);
                System.out.printf("\nValor final: R$%.2f", cultura.calcular(valorFinal));
                break;
            default:
                System.out.println("\nInválido!");
        }
        sc.close();
    }
}