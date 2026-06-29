public non-sealed class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nome, double preco, boolean dublagem) {
        super(nome, preco, dublagem);
    }

    @Override
    public double getValorFinal() {
        return preco / 2;
    }
}
