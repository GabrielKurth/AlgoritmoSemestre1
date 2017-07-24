/*
Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido 
dado o número referente ao dia. Considere que domingo é o dia 1 e sábado é o 
dia 7.
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Dia da semana ***");
        System.out.println("Digite um dia para saber qual o dia da semana");
        System.out.println("1- Domingo | 2- Segunda | 3- Terça | 4- Quarta | 5-Quinta | 6- Sexta | 7- Sabado");
        int dia = read.nextInt();
        switch (dia) {
            case 1:
                System.out.printf("Dia digitado: %d- DOMINGO \n", dia);
                break;
            case 2:
                System.out.printf("Dia digitado: %d- SEGUNDA \n", dia);
                break;
            case 3:
                System.out.printf("Dia digitado: %d- TERÇA \n", dia);
                break;
            case 4:
                System.out.printf("Dia digitado: %d- QUARTA \n", dia);
                break;
            case 5:
                System.out.printf("Dia digitado: %d- QUINTA \n", dia);
                break;
            case 6:
                System.out.printf("Dia digitado: %d- SEXTA \n", dia);
                break;
            case 7:
                System.out.printf("Dia digitado: %d- SABADO \n", dia);
                break;
            default:
                System.err.println("NÚMERO INVÁLIDO!");
        }
    }
}
