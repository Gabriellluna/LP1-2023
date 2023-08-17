package Agenda;


import java.util.List;
import java.util.Scanner;

public class Lembrete extends Eventos{
    Scanner scanner = new Scanner(System.in);
    private String hora;
    public Lembrete(String nome, String data, String descricao, String hora) {
        super(nome, data, descricao);
        this.hora = hora;
    }

    public Lembrete(){

    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLembrete() {
        System.out.println("Qual o nome do lembrete?");
        setNome(scanner.nextLine());

        System.out.println("Qual a data do lembrete?");
        setData(scanner.nextLine());

        System.out.println("Descrição:");
        setDescricao(scanner.nextLine());

        System.out.println("Horário:");
        setHora(scanner.nextLine());
    }
}
