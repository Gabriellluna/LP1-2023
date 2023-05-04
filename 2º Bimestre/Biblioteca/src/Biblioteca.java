import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private Dono dono;
    private List<Livro> listalivros = new ArrayList<>();
    private List<Funcionarios> listafuncionarios = new ArrayList<>();

    public Biblioteca(String nome, Dono dono) {
        this.nome = nome;
        this.dono = dono;

    }

    //getter

    public String getNome() {
        return nome;
    }

    public Dono getDono() {
        return dono;
    }

    //setter


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setListalivros(List<Livro> listalivros) {
        this.listalivros = listalivros;
    }

    public void setListafuncionarios(List<Funcionarios> listafuncionarios) {
        this.listafuncionarios = listafuncionarios;
    }
}
