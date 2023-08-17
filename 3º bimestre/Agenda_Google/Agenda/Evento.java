package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Evento extends Eventos{
    Scanner scanner = new Scanner(System.in);
    public Evento(){}

    public Evento(String nome, String data, String descricao) {
        super(nome, data, descricao);
    }
    public void setEvento() {
        System.out.println("Qual o nome do evento?");
        setNome(scanner.nextLine());

        System.out.println("Qual a data do evento?");
        setData(scanner.nextLine());

        System.out.println("Descrição:");
        setDescricao(scanner.nextLine());
    }
    public void Data(){
        System.out.println("Qual a data do evento?");
        String data = scanner.nextLine();
        setData(data);
    }
    public void Descricao(){
        System.out.println("Descrição:");
        String desc = scanner.nextLine();
        setDescricao(desc);
    }


    }






