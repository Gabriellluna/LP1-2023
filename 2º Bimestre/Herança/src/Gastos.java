public abstract class  Gastos {
    private String nome;
    double valor;

    public Gastos(String nome, double valorInicial) {
        this.nome = nome;
        this.valor = valorInicial;
    }

    public String getNome() {
        return nome;
    }
    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    //getter
    public double getValor() {
        return valor;
    }


    public void mudarvalor(double valorNovo){
        this.valor= valorNovo;
    }
}

