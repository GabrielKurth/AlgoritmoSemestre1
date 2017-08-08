/*
Alguns materiais só podem ser transportados em determinadas temperaturas, conforma a tabela abaixo:
Tipo de Material 	°C Mínimo 	°C Máximo
    A                       10              17
    B                       11              16
    C                       12              15
    D                       13              14

Escreva um programa que pergunta qual o tipo de material que vai ser 
transportado e qual a temperatura que está no local de transporte.
O programa deve indicar se é possível ou não fazer o transporte.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Transporte de materiais ***");
        System.out.print("Tipo de material: ");
        String material = read.nextLine();
        material = material.toUpperCase();
        System.out.print("Qual a temperatura de transporte: ");
        float temperature = Float.parseFloat(read.nextLine());

        switch (material) {
            case "A":
                if (temperature <= 9) {
                    System.out.println("Impossível transportar, temperatura ABAIXO do permitido!");
                } else if (temperature >= 18) {
                    System.out.println("Impossível transportar, temperatura ACIMA do permitido!");
                } else {
                    System.out.println("Possível transportar, temperatura OK!");
                }
                break;
            case "B":
                if (temperature <= 10) {
                    System.out.println("Impossível transportar, temperatura ABAIXO do permitido!");
                } else if (temperature >= 17) {
                    System.out.println("Impossível transportar, temperatura ACIMA do permitido!");
                } else {
                    System.out.println("Possível transportar, temperatura OK!");
                }
                break;
            case "C":
                if (temperature <= 11) {
                    System.out.println("Impossível transportar, temperatura ABAIXO do permitido!");
                } else if (temperature >= 16) {
                    System.out.println("Impossível transportar, temperatura ACIMA do permitido!");
                } else {
                    System.out.println("Possível transportar, temperatura OK!");
                }
                break;
            case "D":
                if (temperature <= 12) {
                    System.out.println("Impossível transportar, temperatura ABAIXO do permitido!");
                } else if (temperature >= 15) {
                    System.out.println("Impossível transportar, temperatura ACIMA do permitido!");
                } else {
                    System.out.println("Possível transportar, temperatura OK!");
                }
                break;
            default:
                System.err.println("Tipo de material incorreto!");
        }
    }
}
