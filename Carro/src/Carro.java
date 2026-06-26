import java.util.Scanner;

public class Carro {
    private double velocidade;
    private int marcha;
    private boolean ligado;

    public Carro(double velocidade, int marcha, boolean ligado){
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.ligado = ligado;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public double getMarcha() {
        return marcha;
    }
    public void menu (){
        System.out.println("1 - Ligar/Desligar Veículo");
        System.out.println("2 - Acelerar");
        System.out.println("3 - Freiar");
        System.out.println("4 - Aumentar Marcha");
        System.out.println("5 - Diminuir Marcha");
        System.out.println("6 - Virar a Direita");
        System.out.println("7 - Virar a Esquerda");
        System.out.println("8 - Sair");
    }
    public void acelerar(){
        if (ligado == true) {
            if (marcha == 0) {
                System.out.println("Ponto Morto!");
                return;
            } else if (marcha == 1) {
                if (velocidade < 20) {
                    this.velocidade = ++velocidade;
                }
            } else if (marcha == 2) {
                if (velocidade < 40) {
                    this.velocidade = ++velocidade;
                }
            } else if (marcha == 3) {
                if (velocidade < 60) {
                    this.velocidade = ++velocidade;
                }
            } else if (marcha == 4) {
                if (velocidade < 80) {
                    this.velocidade = ++velocidade;
                }
            } else if (marcha == 5) {
                if (velocidade < 100) {
                    this.velocidade = ++velocidade;
                }
            } else if (marcha == 6) {
                if (velocidade < 120) {
                    this.velocidade = ++velocidade;
                }
            }
            System.out.println("Acelerando! Velocidade: " + this.velocidade + "Km/h");
            System.out.println();
        } else System.out.println("Carro desligado!");
    }
    public void freiar(){
        if (ligado == true) {
            if (marcha == 0) {
                System.out.println("Ponto Morto!");
            } else if (marcha == 1) {
                if ((velocidade <= 20) && (velocidade > 0)) {
                    this.velocidade = --velocidade;
                }
            } else if (marcha == 2) {
                if ((velocidade <= 40) && (velocidade > 20)) {
                    this.velocidade = --velocidade;
                }
            } else if (marcha == 3) {
                if ((velocidade <= 60) && (velocidade > 40)) {
                    this.velocidade = --velocidade;
                }
            } else if (marcha == 4) {
                if ((velocidade <= 80) && (velocidade > 60)) {
                    this.velocidade = --velocidade;
                }
            } else if (marcha == 5) {
                if ((velocidade <= 100) && (velocidade > 80)) {
                    this.velocidade = --velocidade;
                }
            } else if (marcha == 6) {
                if ((velocidade <= 120) && (velocidade > 100)) {
                    this.velocidade = --velocidade;
                }
            }
            System.out.println("Freiando! Velocidade: " + this.velocidade + " Km/h");
            System.out.println();
        } else  System.out.println("Carro desligado!");
    }
    public void subirMarcha(){
        if ((marcha < 6) && (ligado == true)) {
            this.marcha = ++marcha;
        }
        System.out.println("Aumentou a marcha! Marcha: " + this.marcha);
        System.out.println();
    }
    public void descerMarcha(){
        if ((marcha >= 0) && (ligado == true)){
            this.marcha = --marcha;
        }
        System.out.println("Diminuiu a marcha! Marcha: " + this.marcha);
        System.out.println();
    }
    public void virarDireita (){
        if (ligado == true) {
            if ((velocidade >= 1) && (velocidade <= 40)) {
                System.out.println("Você virou a direita!");
                System.out.println();
            } else {
                System.out.println("Você não está na velocidade para virar!");
                System.out.println();
            }
        } else System.out.println("Carro desligado!");
    }
    public void virarEsquerda(){
        if (ligado == true) {
            if ((marcha >= 1) && (marcha <= 2)) {
                System.out.println("Você virou a esquerda!");
                System.out.println();
            } else {
                System.out.println("Você não esta na velocidade para virar!");
                System.out.println();
            }
        } else System.out.println("Carro desligado!");
    }
    public void ligarDesligar(){
        if (ligado == false){
            this.ligado = true;
            System.out.println("Carro Ligado!");
            System.out.println();
        } else if ((ligado == true) && (marcha == 0)){
            this.ligado = false;
            System.out.println("Carro Desligado!");
            System.out.println();
        }
    }
    public void retornar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pressione qualquer número para voltar ao menu!");
        int escolha = sc.nextInt();
    }
}
