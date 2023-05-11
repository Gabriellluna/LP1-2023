import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Leiturem", new Dono(" Roberto Marques", "548.569.231-58"));
        Funcionarios funcionario1 = new Funcionarios("Gustavo Lula", " 698");
        Funcionarios funcionario2 = new Funcionarios("Gabriel Emiliano", " 896");
        Livro livro = new Livro("Vida no ceu", "Lilian Marques", "2015");
        Livro livro2 = new Livro("Vida no inferno", "Lilian marruda", "2066");

        Random random = new Random();

        biblioteca.addlivros(livro2);
        biblioteca.addlivros(livro);
        biblioteca.addfunc(funcionario1);
        biblioteca.addfunc(funcionario2);

        System.out.println("======================================================================================");




        System.out.println("Nossa biblioteca se chama " + biblioteca.getNome() + " cujo dono é " + biblioteca.getDono().getNome());
        System.out.println(" O CPF do dono é: " + biblioteca.getDono().getCpf());
        biblioteca.Mostrarlivros();
        System.out.println("");
        System.out.println("======================================================================================");

        System.out.println("O funcionário do mês é: " +biblioteca.getListafuncionarios().get(random.nextInt(2)).getNome());
        System.out.println("Parabéns!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
