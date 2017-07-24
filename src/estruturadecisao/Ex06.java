/*
Criar um programa para identificar se um dia da semana (numerados de 1 a 7) é dia de
semana, fim de semana ou um dia inválido. 
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Dia da semana ***");
        System.out.println("    1-Domingo até 7-Sabado");
        System.out.print("Digite o dia: ");
        int dia = Integer.parseInt(read.nextLine());
        if (dia == 1 || dia == 7) {
            if (dia == 1) {
                System.out.println("Dia digitado foi DOMINGO");
                System.out.println("    Final de semana");
            } else if (dia == 7) {
                System.out.println("Dia digitado foi SABADO");
                System.out.println("    Final de semana");
            }
        } else if (dia > 1 && dia < 7) {
            if (dia == 2) {
                System.out.println("Dia digitado foi SEGUNDA");
                System.out.println("    Dia de semana");
            } else if (dia == 3) {
                System.out.println("Dia digitado foi TERÇA");
                System.out.println("    Dia de semana");
            } else if (dia == 4) {
                System.out.println("Dia digitado foi QUARTA");
                System.out.println("    Dia de semana");
            } else if (dia == 5) {
                System.out.println("Dia digitado foi QUINTA");
                System.out.println("    Dia de semana");
            } else if (dia == 6) {
                System.out.println("Dia digitado foi SEXTA");
                System.out.println("    Dia de semana");
            }
        } else {
            System.err.println("Dia inválido!!!");
        }
    }
}
