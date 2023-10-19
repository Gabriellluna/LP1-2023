package gte.br.gte3.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
@Entity
@Table
public class Tarefa {

    //Esta classe é responsavel por modelar uma tarefa escolar
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id; //Chave identificadora do usuario
    @Column
    private String Titulo; //NomeSignificativo da tarefa
    @Column
    private String Descricao; //Descrição da tarefa
    @Column
    private String Status; // Estado da tarefa, podendo ser concluída ou pendente

    private Date DataInicio; // Data em que se iniciou a Tarefa
    @Column
    private Date DataVencimento; // Data em que a tarefa é fechada

    private Disciplina disciplina; // Discliplina asssociada

    private Categoria categoria; // Categoria asssociada

    private LocalDateTime dataConclusao; //
    private  boolean entregue;


    //construtores

    public Tarefa(String titulo, String descricao, String status, Date dataInicio, Date dataVencimento, Disciplina disciplina, Categoria categoria, LocalDateTime
            dataConclusao) {
        Titulo = titulo;
        Descricao = descricao;
        Status = status;
        DataInicio = dataInicio;
        DataVencimento = dataVencimento;
        this.disciplina = disciplina;
        this.categoria = categoria;
        this.dataConclusao = dataConclusao;
    }


    //getters

    public Long getId() {
        return Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getStatus() {
        return Status;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public Date getDataVencimento() {
        return DataVencimento;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }
    //setters

    public void setId(Long id) {
        Id = id;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setDataInicio(Date dataInicio) {
        DataInicio = dataInicio;
    }

    public void setDataVencimento(Date dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }


    //Este método faz o cálculo de quantos dias o usuário tem para enviar a tarefa
    //Importamos as classes necessárias do pacote java.time para trabalhar com datas.
    //Definimos o método CalculaDiasRestantes que recebe duas datas como argumentos, dataInicio e dataVencimento.
    //Usamos a classe ChronoUnit para calcular a diferença em dias entre as duas datas.
    //Imprimimos o resultado na tela.
    //Feito por Gustavo Emiliano

    public void CalculaDiasRestantes(LocalDate dataInicio, LocalDate dataVencimento) {
        long diasRestantes = ChronoUnit.DAYS.between(dataInicio, dataVencimento);

        System.out.println("Dias restantes: " + diasRestantes);

    }

    //Esse método de código permite determinar o status de uma tarefa.
    //É baseado em sua data de conclusão e a data atual.
    //Ele retorna "Concluído" se a tarefa estiver concluída.
    //Ele retorna "Atrasado" se estiver atrasada.
    //Ele retorna "Em Progresso" se estiver em andamento.
    //Feito por Gustavo Emiliano
    //O boolean

    public void concluido(){
        String SN;
        Scanner scan = new Scanner(System.in);
        System.out.println("Você concluiu esta tarefa?1");
        SN = String.valueOf(scan.nextBoolean());

        if(SN == "S"){
            entregue = true;
        }else if(SN == "N"){
            entregue = false;
        }
    }

    public String VerificaStatus(LocalDateTime dataConclusao, boolean entregue ){
        LocalDateTime hoje = LocalDateTime.now();


        if (entregue) {
            return "Concluído";
        } else if (hoje.isBefore(ChronoLocalDateTime.from(dataConclusao))) {
            return "Você pode entregar até:" + dataConclusao;
        } else if (hoje.isAfter(ChronoLocalDateTime.from(dataConclusao))) {
            return "Atrasado";
        } else {
            return "Em Progresso";
        }
    }


    //ToString

    @Override
    public String toString() {
        return "Tarefa{" +
                "Id=" + Id +
                ", Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Status='" + Status + '\'' +
                ", DataInicio=" + DataInicio +
                ", DataVencimento=" + DataVencimento +
                ", disciplina=" + disciplina +
                ", categoria=" + categoria +
                '}';
    }
}