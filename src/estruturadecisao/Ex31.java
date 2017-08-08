/*
Escreva um programa que lê uma letra e mostra se ela é uma vogal ou consoante.
Atenção: use o comando switch
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Vogal ou Consoante? ***");
        System.out.print("Digite uma letra: ");
        String letter = read.nextLine();
        letter = letter.toUpperCase();
        if(letter.length() >= 2){
            System.err.println("Letra incorreta!!!");
        }
        switch(letter){
            case "A":
                System.out.printf("Letra: %s - VOGAL \n", letter);
                break;
            case "E":
                System.out.printf("Letra: %s - VOGAL \n", letter);
                break;
            case "I":
                System.out.printf("Letra: %s - VOGAL \n", letter);
                break;
            case "O":
                System.out.printf("Letra: %s - VOGAL \n", letter);
                break;
            case "U":
                System.out.printf("Letra: %s - VOGAL \n", letter);
                break;
            default:
                System.out.printf("Letra: %s - CONSOANTE \n", letter);
                break;
        }
    }
}
