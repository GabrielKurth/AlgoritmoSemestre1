/*
Escreva um programa que jogue o jogo "Papel, Pedra, Tesoura" com você.
 */
package estruturadecisao;

import java.util.Scanner;
import java.util.Random;

public class Ex24 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random lottery = new Random();
        System.out.println("*** Jokenpô ***");
        System.out.println("1- PEDRA | 2- PAPEL | 3- TESOURA");
        System.out.print("Escolha uma das opções acima: ");
        int escolha = Integer.parseInt(read.nextLine());
        if (escolha < 1 || escolha > 3) {
            System.err.println("Escolha inválida!!!");
            System.exit(escolha);
        }
        int EscolhaMaquina = lottery.nextInt(3) + 1;
        System.out.println("----------------------------------------");
        System.out.println("Sua escolha - " + escolha);
        System.out.println("Escolha do PC - " + EscolhaMaquina);
        System.out.println("----------------------------------------");
        if (escolha == 1 && EscolhaMaquina == 2) {
            System.out.println("PC VENCEU!!!");
        }
        if (escolha == 2 && EscolhaMaquina == 3) {
            System.out.println("PC VENCEU!!!");
        }
        if (escolha == 3 && EscolhaMaquina == 1) {
            System.out.println("PC VENCEU!!!");
        }
        if(escolha == EscolhaMaquina){
            System.out.println("EMPATE!!!");
        }
        if(escolha == 1 && EscolhaMaquina == 3){
            System.out.println("VOCÊ VENCEU!!!");
        }
        if(escolha == 2 && EscolhaMaquina == 1){
            System.out.println("VOCÊ VENCEU!!!");
        }
        if(escolha == 3 && EscolhaMaquina == 2){
            System.out.println("VOCÊ VENCEU!!!");
        }
    }
}
