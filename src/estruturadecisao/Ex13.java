/*
Escreva um programa em Java que lê o tamanho dos dois catetos de um 
triângulo retângulo e que mostra o perímetro do triângulo.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Perimetro do triangulo retangulo ***");
        System.out.print("Digite o primeiro cateto: ");
        double cate1 = Double.parseDouble(read.nextLine());
        System.out.print("Digite o segundo cateto: ");
        double cate2 = Double.parseDouble(read.nextLine());
        double hipo = (Math.pow(cate1, 2) + (Math.pow(cate2, 2)));
        double hipotenusa = Math.sqrt(hipo);
        double peri = cate1 + cate2 + hipotenusa;
        System.out.println("O perimetro do triangulo retangulo é: " + peri);
    }
}
