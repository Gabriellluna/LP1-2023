import java.util.Scanner;

public class thebroxas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        while(true){

            System.out.println("Digite a operação matemática que deseja fazer (- + x :) ");
            char op = scanner.next().charAt(0);
            if (op == '0'){
                break;
            }
            while (op != '+' && op != 'x' && op != ':' && op != '-') {
                System.out.println("Insira um operador válido:" + op);
                op = scanner.nextLine().charAt(0);
            }
            System.out.println("Insira dois números para a operação ser comcluída:");
            double numero = scanner.nextDouble();
            double numeroo = scanner.nextDouble();
            double result;
            switch (op) {
                case '+':
                    result = numero + numeroo;
                    System.out.println("O Stringresultado é:" + result);
                    break;
                case '-':
                    result = numero - numeroo;
                    System.out.println("O resultado é:" + result);
                    break;
                case ':':
                    result = numero / numeroo;
                    System.out.println("O resultado é:" + result);
                    break;
                case 'x':
                    result = numero * numeroo;
                    System.out.println("O resultado é:" + result);
                    break;
            }
            //System.out.println("Quer continuar a usar o programa? S ou N?");
            //opcao = scanner.next().charAt(0);
        }
    }
}