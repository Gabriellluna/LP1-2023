package entity;

import jakarta.persistence.*;

@Entity
@Table(name="Enderecos")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String rua;
    @Column
    private String cidade;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "endereco")
    private Pessoa pessoa;


    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Endereco:" +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", id='" + id + '\'';
    }
}
