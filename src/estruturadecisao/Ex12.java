/*
Escreva um programa em Java que lê o tamanho dos dois catetos de um 
triângulo retângulo e que mostra o tamanho da hipotenusa.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Hipotenusa ***");
        System.out.print("Digite o tamanho do cateto A: ");
        double catetoA = Double.parseDouble(read.nextLine());
        System.out.print("Digite o tamanho do cateto B: ");
        double catetoB = Double.parseDouble(read.nextLine());
        catetoA = Math.pow(catetoA, 2);
        catetoB = Math.pow(catetoB, 2);
        double hipotenusa = catetoA + catetoB;
        hipotenusa = Math.sqrt(hipotenusa);
        System.out.printf("Hipotenusa = %.2f \n", hipotenusa);
    }
}
