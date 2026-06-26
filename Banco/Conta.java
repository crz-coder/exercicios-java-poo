public class Conta {

    private double saldo;
    private double chequeEsp;
    private double limiteEsp;

    public Conta(double saldo, double chequeEsp) {
        this.saldo = saldo;
        this.chequeEsp = chequeEsp;
        this.limiteEsp = chequeEsp;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getChequeEsp() {
        return chequeEsp;
    }
    public void depositar(double valorDepositado){
        if (chequeEsp < limiteEsp) {
            double resto = limiteEsp - chequeEsp;
            double juros = resto * 0.2;
            valorDepositado -= resto + juros;
            this.chequeEsp += resto;
            this.saldo += valorDepositado;
        } else this.saldo += valorDepositado;
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
