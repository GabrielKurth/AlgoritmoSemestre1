/*
Escreva um programa que pergunta de quem é a vez de jogar (O ou X) e em qual posição será feita a jogada.
Após isso, ele deve imprimir um tabuleiro de jogo-da-velha preenchido com a jogada informada.
Exemplo:
 1 | 2 | 3
---+---+---
 4 | 5 | 6
---+---+---
 7 | 8 | 9
De quem é a vez? O<enter>
Em qual posição? 5<enter>
   |   |
---+---+---
   | O |
---+---+---
   |   |
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Jogo da velha ***");
        String posicao1 = "1", posicao2 = "2", posicao3 = "3", posicao4 = "4", posicao5 = "5",
                posicao6 = "6", posicao7 = "7", posicao8 = "8", posicao9 = "9";
        System.out.printf(" %s  |  %s  | %s\n"
                + "---+----+----\n"
                + " %s  |  %s  | %s\n"
                + "---+----+----\n"
                + " %s  |  %s  | %s\n", posicao1, posicao2, posicao3, posicao4,
                posicao5, posicao6, posicao7, posicao8, posicao9);
        System.out.print("De quem é a vez(X/O): ");
        String vez = read.nextLine();
        vez = vez.toUpperCase();
        System.out.println("Qual a posição: ");
        int posicao = Integer.parseInt(read.nextLine());
        switch (posicao) {
            case 1:
                posicao1 = vez;
                break;
            case 2:
                posicao2 = vez;
                break;
            case 3:
                posicao3 = vez;
                break;
            case 4:
                posicao4 = vez;
                break;
            case 5:
                posicao5 = vez;
                break;
            case 6:
                posicao6 = vez;
                break;
            case 7:
                posicao7 = vez;
                break;
            case 8:
                posicao8 = vez;
                break;
            case 9:
                posicao9 = vez;
                break;
            default:
                System.err.println("Posição incorreta!");
                break;
        }
        System.out.printf(" %s  |  %s  | %s\n"
                + "---+----+----\n"
                + " %s  |  %s  | %s\n"
                + "---+----+----\n"
                + " %s  |  %s  | %s\n", posicao1, posicao2, posicao3, posicao4,
                posicao5, posicao6, posicao7, posicao8, posicao9);
    }
}
