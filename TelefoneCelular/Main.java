import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite um número de telefone/celular para ser formatado:");
        Scanner sc = new Scanner(System.in);
        var telefone = sc.nextLine();
        var resultado = new ValidarTelefone(telefone).validarTipo();
        System.out.println(resultado);
    }
}