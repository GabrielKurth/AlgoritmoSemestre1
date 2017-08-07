/*
Escreva um algoritmo que lê o seu tipo sanguíneo e mostra:

Para quais tipos você pode fazer uma doação de sangue
De quais tipos você pode receber uma doação de sangue
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("--- Compatibilidade de tipos sanguíneos ---");
        System.out.print("Digite o tipo sanguineo: ");
        String blood = read.nextLine();
        blood = blood.toUpperCase();
        switch (blood) {
            case "A+":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: AB+ e A+");
                System.out.println("Pode receber de: A+, A-, O+ e O-");
                break;
            case "A-":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: A+, A-, AB+ e AB-");
                System.out.println("Pode receber de: A- e O-");
                break;
            case "B+":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: B+ e AB+");
                System.out.println("Pode receber de: B+, B-, O+ e O-");
                break;
            case "B-":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: B+, B- AB+ e AB-");
                System.out.println("Pode receber de: B- e O-");
                break;
            case "AB+":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: AB+");
                System.out.println("Pode receber de: A+, A-, B+, B-, AB+, AB-, O+ e "
                        + "O- (TODOS)");
                break;
            case "AB-":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: AB+ e AB-");
                System.out.println("Pode receber de: A-, B-, O+ e AB-");
                break;
            case "O+":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: A+, B+, O+ e AB+");
                System.out.println("Pode receber de: O+ e O-");
                break;
            case "O-":
                System.out.printf("Seu tipo sanguineo é: %s \n", blood);
                System.out.println("Pode doar para: A+, A-, B+, B-, AB+, AB-, O+ e "
                        + "O- (TODOS)");
                System.out.println("Pode receber de: O-");
                break;
            default:
                System.err.println("Tipo incorreto!!!");
        }
    }
}
