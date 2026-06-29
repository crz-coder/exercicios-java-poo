public non-sealed class PacoteFamilia extends Ingresso {
    private int numPessoas;

    public PacoteFamilia(String nome, int numPessoas, double preco, boolean dublagem) {
        super(nome, preco, dublagem);
        this.numPessoas = numPessoas;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    @Override
    public double getValorFinal() {
        double realValor = preco * numPessoas;
        if (this.numPessoas > 3) {
            double resto = realValor * 0.05;
            return realValor - resto;
        } else {
            return realValor;
        }
    }
}
