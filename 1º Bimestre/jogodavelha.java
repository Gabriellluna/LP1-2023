import java.util.Scanner;
public class jogodavelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = 0;
        int z = 0;
        int escolha;
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        System.out.println();
        System.out.println("Escolha 1 se quiser usar o caractere 'X' ou 2 se quiser usar o caractere 'O'");
        escolha = scanner.nextInt();
        System.out.println(escolha);
        while (escolha != 1 && escolha != 2) {
            System.out.println("Insira um caractere válido, 1 ou 2:");
            escolha = scanner.nextInt();
        }
        switch (escolha) {
            case 1:
                System.out.println("Você é o jogador 1 e usa 'X'. O jogador 2 usa 'O'");
                System.out.println("");
                System.out.println("");
                break;
            case 2:
                System.out.println("Você é o jogador 2 e usa 'O'. O jogador 1 usa 'X'");
                System.out.println("");
                System.out.println("");
                break;
        }

        tabulas(tabuleiro);
        if (escolha == 1) {
            while(z < 9) {
                char[] car = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};
                if(z % 2 == 0){
                    System.out.println("Vez do jogador 1 (X)");
                }else{
                    System.out.println("Vez do jogador 2 (O)");
                }
                System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                if (!(tabuleiro[linha][coluna] == ' ')){
                    while((!(tabuleiro[linha][coluna] == ' '))) {
                        System.out.println("Insira o caractere em uma casa vazia:");
                        linha = scanner.nextInt();
                        coluna = scanner.nextInt();
                    }
                }
                tabuleiro[linha][coluna] = car[z];
                ++z;
                tabulas(tabuleiro);
                if (verificacao2(tabuleiro)) {
                    System.out.println("Fim de jogo!!!");
                    break;
                } else if (verificacao1(tabuleiro)) {
                    System.out.println("Fim de jogo!!!");
                    break;
                }else if (z == 9){
                    System.out.println("Deu Velha!!!");
                }
            }


        } else if (escolha == 2) {
            while(y < 9) {
                char[] car = {'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O',};
                if(y % 2 == 0){
                    System.out.println("Vez do jogador 2 (O)");
                }else{
                    System.out.println("Vez do jogador 1 (X)");
                }
                System.out.println("Insira a linha e a coluna que deseja colocar o caractere:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                if (!(tabuleiro[linha][coluna] == ' ')){
                    while((!(tabuleiro[linha][coluna] == ' '))) {
                        System.out.println("Insira o caractere em uma casa vazia:");
                        linha = scanner.nextInt();
                        coluna = scanner.nextInt();
                    }
                }
                tabuleiro[linha][coluna] = car[y];
                ++y;
                tabulas(tabuleiro);
                if (verificacao2(tabuleiro)){
                    System.out.println("Fim de jogo!!!");
                    break;
                } else if (verificacao1(tabuleiro)) {
                    System.out.println("Fim de jogo!!!");
                    break;
                }else if (y == 9){
                    System.out.println("Deu Velha!!!");
                }
            }
        }
    }
    public static void tabulas(char[][] tabuleiro) {
        Scanner scanner = new Scanner(System.in);
        int p = 0;
        char[] carac = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};
        System.out.println("    0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + tabuleiro[i][j]);
            }
            System.out.println("|");
            System.out.println("  ----------");
        }
    }
    public static boolean verificacao2(char[][] t) {
        //testes
        Scanner scanner = new Scanner(System.in);
        String ganhou = " ";
        if (t[0][0] == 'O' && t[0][1] == 'O' && t[0][2] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[1][0] == 'O' && t[1][1] == 'O' && t[1][2] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[2][0] == 'O' && t[2][1] == 'O' && t[2][2] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[0][0] == 'O' && t[1][0] == 'O' && t[2][0] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[0][1] == 'O' && t[1][1] == 'O' && t[2][1] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[0][2] == 'O' && t[1][2] == 'O' && t[2][2] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[0][0] == 'O' && t[1][1] == 'O' && t[2][2] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        } else if (t[2][0] == 'O' && t[1][1] == 'O' && t[0][2] == 'O') {
            System.out.println("Jogador 2 ganhou!!!");
            ganhou = "Jogador 2 ganhou!!!";
        }
        boolean g2 = (ganhou == "Jogador 2 ganhou!!!");
        return g2;
    }
    public static boolean verificacao1 ( char t[][]){
        //testes
        Scanner scanner = new Scanner(System.in);
        String ganhou = " ";
        if (t[0][0] == 'X' && t[0][1] == 'X' && t[0][2] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[1][0] == 'X' && t[1][1] == 'X' && t[1][2] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[2][0] == 'X' && t[2][1] == 'X' && t[2][2] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[0][0] == 'X' && t[1][0] == 'X' && t[2][0] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[0][1] == 'X' && t[1][1] == 'X' && t[2][1] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[0][2] == 'X' && t[1][2] == 'X' && t[2][2] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[0][0] == 'X' && t[1][1] == 'X' && t[2][2] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        } else if (t[2][0] == 'X' && t[1][1] == 'X' && t[0][2] == 'X') {
            System.out.println("Jogador 1 ganhou!!!");
            ganhou = "Jogador 1 ganhou!!!";
        }
        boolean g1 = (ganhou == "Jogador 1 ganhou!!!");
        return g1;
    }
}


