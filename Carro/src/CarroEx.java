import java.util.Scanner;

public class CarroEx {

    public static void main(String[] args) {

        double velocidade = 0;
        int marcha = 0;
        boolean ligado = false;

        Carro newcar = new Carro(velocidade, marcha, ligado);
        Scanner sc = new Scanner(System.in);
        int escolha = 1;
        do {
            newcar.menu();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    newcar.ligarDesligar();
                    newcar.retornar();
                    break;
                case 2:
                    newcar.acelerar();
                    newcar.retornar();
                    break;
                case 3:
                    newcar.freiar();
                    newcar.retornar();
                    break;
                case 4:
                    newcar.subirMarcha();
                    newcar.retornar();
                    break;
                case 5:
                    newcar.descerMarcha();
                    newcar.retornar();
                    break;
                case 6:
                    newcar.virarDireita();
                    newcar.retornar();
                    break;
                case 7:
                    newcar.virarEsquerda();
                    newcar.retornar();
                    break;
                case 8:
                    System.out.println("Você está saindo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    newcar.menu();
            }
        } while (escolha != 8);
    }
}