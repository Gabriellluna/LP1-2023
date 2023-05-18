public abstract class Gastos {
    private String nome;
    private double valor;

    public Gastos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //setter
    public void MudarValor(double valor){
        this.valor = valor;

    }

}


