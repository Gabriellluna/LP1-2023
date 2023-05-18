public class Lazer extends Gastos {

    public Lazer(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void MudarValor(double valor) {

    }

    private boolean importante;

    public Lazer(String nome, double valor, boolean importante) {
        super(nome, valor);
        this.importante = importante;
    }
}
