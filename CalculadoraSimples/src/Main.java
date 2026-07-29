import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var loop = 1;
        while (loop == 1) {
            System.out.println("Bem-vindo a calculadora de soma e subtração!");
            System.out.println("Escolha:\n1 - Somar\n2 - Subtrair");
            var escolha = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite os números que quer usar, separados por uma vírgula:");
            var numeros = sc.nextLine();

            String[] partes = numeros.split(",");

            switch (escolha) {
                case 1:
                    var resultadoSoma = 0;
                    for (String s : partes){
                        var numero = Integer.parseInt(s);
                        resultadoSoma = resultadoSoma + numero;
                    }
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                case 2:
                    var resultadoSub = Integer.parseInt(partes[0]);
                    for (int i = 1; i < partes.length; i++){
                        var numero = Integer.parseInt(partes[i]);
                        resultadoSub = resultadoSub - numero;
                    }
                    System.out.println("Resultado da subtração: " + resultadoSub);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("Digite:\n1 - Tentar novamente.\n2 - Sair.");
            loop = sc.nextInt();
        }
    }
}