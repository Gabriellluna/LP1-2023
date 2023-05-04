public class Dono {
    private String nome;
    private String cpf;

    public Dono(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    //getter

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    //setter


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
