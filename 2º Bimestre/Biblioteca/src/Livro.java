public class Livro {
    private String nome;
    private String autor;
    private String ano;

    public Livro(String nome, String autor, String ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }

    //getter

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getAno() {
        return ano;
    }

    //setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

