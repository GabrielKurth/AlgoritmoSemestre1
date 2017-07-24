/*
 Escreva um algoritmo que lê os os pontos onde uma parábola intercepta o eixo x 
(as raízes) e o ponto onde ela intercepta o eixo y (o coeficiente c) e que 
mostra os coeficientes a, b e c de uma equação de 2º grau que gera essa parábola.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Bhaskara às avessas ***");
        System.out.print("Digite o x1: ");
        double x1 = read.nextDouble();
        System.out.print("Digite o x2: ");
        double x2 = read.nextDouble();
        System.out.print("Digite o C: ");
        double c = read.nextDouble();
        double soma = x1 + x2;
        double produto = x1 * x2;
        double a = c / produto;
        double b = -(a * soma);
        System.out.println(a + "x² " + b + "x + " + c + " =0");
    }
}
