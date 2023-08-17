package Agenda;


import java.util.Scanner;

public class Tarefa extends Eventos{

    Scanner scanner = new Scanner(System.in);
    public Tarefa(){

    }
    private String horai;
    private String horaf;
    public Tarefa(String nome, String data, String horai, String horaf, String descricao) {
        super(nome, data, descricao);
        this.horai = horai;
        this.horaf = horaf;
    }

    public void setHorai(String horai) {
        this.horai = horai;
    }

    public void setHoraf(String horaf) {
        this.horaf = horaf;
    }

    public void setTarefa(){
        System.out.println("Qual o nome da tarefa?");
        setNome(scanner.nextLine());

        System.out.println("Qual a data da tarefa?");
        setData(scanner.nextLine());

        System.out.println("Descrição:");
        setDescricao(scanner.nextLine());

        System.out.println("Indique o horário de início:");
        setHorai(scanner.nextLine());

        System.out.println("Indique o horário final");
        setHoraf(scanner.nextLine());

    }

}
