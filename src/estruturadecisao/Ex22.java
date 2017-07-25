/*
Escreva um algoritmo que sorteia um número entre 1 e 10 (inclusos) e depois pede
para o usuário tentar adivinhá-lo. Caso o número lido seja igual ao sorteado, 
mostre a mensagem “Você acertou!”. Caso contrário, mostre a mensagem “Você errou!”.
 */
package estruturadecisao;

import java.util.Scanner;
import java.util.Random;

public class Ex22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random sorteio = new Random();
        System.out.println("*** Adivinhe o número ***");
        System.out.println("Tente adivinhar o número sorteado(1-10)");
        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(read.nextLine());
        if (numero < 1 || numero > 10) {
            System.err.println("Número inválido!!!");
            System.exit(numero);
        }
        System.out.print("Pressione ENTER para sortear o número...");
        String loading = read.nextLine();
        int NumeroSorteado = sorteio.nextInt(10) + 1;
        if (numero == NumeroSorteado) {
            System.out.println("VOCÊ ACERTOOOOU!!!");
        } else {
            System.err.println("VOCÊ ERROOOOU!!!");
        }
        System.out.println("Número sorteado: " + NumeroSorteado);
    }
}
