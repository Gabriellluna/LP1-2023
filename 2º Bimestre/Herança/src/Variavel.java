public class Variavel extends Gastos{
    private int tempoMeses;

    //construtor
    public Variavel(String nome, double valor, int tempoMeses) {
        super(nome, valor);
        this.tempoMeses=tempoMeses;
    }

    //getter
    public int getTempoMeses() {
        return tempoMeses;
    }

    //setter
    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }

    public double Valor_Total(double valorT){
        valorT = valor * tempoMeses;
        return valorT;
    }
}
