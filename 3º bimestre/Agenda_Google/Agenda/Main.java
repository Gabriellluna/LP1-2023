package Agenda;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        int tipo;
        Scanner scanner = new Scanner(System.in);
        Evento evento = new Evento();
        Tarefa tarefa = new Tarefa();
        Lembrete lembrete = new Lembrete();

        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        ArrayList<Lembrete> lembretes = new ArrayList<>();

        System.out.println("-------------------");
        System.out.println("Bem vindo ao LOOGLE");
        System.out.println("-------------------");
        System.out.println("Você deseja criar um evento, um lembrete ou uma tarefa?");
        System.out.println("Evento - 1");
        System.out.println("Lembrete - 2");
        System.out.println("Tarefa - 3");
        System.out.println("Digite aqui:");
        tipo = scanner.nextInt();
        System.out.println(tipo);


        switch (tipo){
            case 1:
                evento.setEvento();
                eventos.add(evento);
                for( Evento evento1 : eventos){
                    System.out.println(evento1);
                }
                break;
            case 2:
                tarefa.setTarefa();
                tarefas.add(tarefa);
                for (Tarefa tarefa1 : tarefas){
                    System.out.println(tarefa1);
                }
                break;
            case 3:
                lembrete.setLembrete();
                lembretes.add(lembrete);
                for (Lembrete lembrete1 : lembretes){
                    System.out.println(lembrete1);
                }
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
