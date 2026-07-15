import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("Escreva sua mensagem aqui: ");
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        SistemaMensagem sms = Mensagem -> System.out.println("Enviando... \n[SMS] " + msg);
        SistemaMensagem email = Mensagem -> System.out.println("Enviando... \n[E-MAIL] " + msg);
        SistemaMensagem redes = Mensagem -> System.out.println("Enviando... \n[REDES SOCIAIS] " + msg);
        SistemaMensagem whatsapp = Mensagem -> System.out.println("Enviando... \n[WHATSAPP] " + msg);

        SistemaMensagem canalEscolhido = null;

        System.out.println("Deseja enviar a mensagem por onde?");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - Redes Sociais");
        System.out.println("4 - WhatsApp");
        switch (sc.nextInt()){
            case 1:
                canalEscolhido = sms;
                canalEscolhido.enviarMensagem(msg);
                break;
            case 2:
                canalEscolhido = email;
                canalEscolhido.enviarMensagem(msg);
                break;
            case 3:
                canalEscolhido = redes;
                canalEscolhido.enviarMensagem(msg);
                break;
            case 4:
                canalEscolhido = whatsapp;
                canalEscolhido.enviarMensagem(msg);
            default:
                System.out.println("Inválido!");
        }
    }
}