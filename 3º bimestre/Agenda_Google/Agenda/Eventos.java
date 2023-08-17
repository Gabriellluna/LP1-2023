package Agenda;


public class Eventos {
    private String nome;
    private String data;
    private String descricao;
    public Eventos(String nome, String data, String descricao) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
    }
    public Eventos() {
    }
    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
