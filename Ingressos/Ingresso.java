public sealed class Ingresso permits MeiaEntrada, PacoteFamilia {
    protected String nome;
    protected double preco;
    protected boolean dublagem;

    public Ingresso(String nome, double preco, boolean dublagem) {
        this.nome = nome;
        this.preco = preco;
        this.dublagem = dublagem;
    }

    public String getNome() {
        return nome;
    }
    public double  getValorFinal() {
        return preco;
    }
    public String getDublagem() {
       return dublagem ? "Dublado" : "Legendado";
    }
}

