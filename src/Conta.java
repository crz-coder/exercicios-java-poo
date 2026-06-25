public class Conta {

    private double saldo;
    private double chequeEsp;

    public Conta(double saldo, double chequeEsp) {
        this.saldo = saldo;
        this.chequeEsp = chequeEsp;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getChequeEsp() {
        return chequeEsp;
    }
    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    }
    public void sacar(double valorSacado){
        if ((valorSacado > saldo) && (valorSacado <= saldo + chequeEsp)){
            var resto = valorSacado - saldo;
            this.chequeEsp = chequeEsp - resto;
            this.saldo = 0;
        } else if (valorSacado > saldo + chequeEsp) {
            System.out.println("Crédito insuficiente!");
        } else if (valorSacado < 0){
            System.out.println("Valor Inválido!");
        } else this.saldo -= valorSacado;
    }
}
