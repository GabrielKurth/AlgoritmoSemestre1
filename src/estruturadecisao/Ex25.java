/*
 Escreva um programa em Java que lê um número entre 1 e 12 e mostra o seu dobro.

Importante: valide a entrada, ou seja, se o número não estiver entre 1 e 12, 
mostre uma mensagem de erro para o usuário.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Validação ***");
        System.out.print("Digite um número entre 1 e 12 e descubra o dobro: ");
        int num = read.nextInt();
        if (num < 1 || num > 12) {
            System.err.println("Número inválido!!!!");
            System.exit(num);
        }
        int dobro = num * 2;
        System.out.println("O número digitado foi: " + num);
        System.out.println("Seu dobro é: " + dobro);
    }
}
