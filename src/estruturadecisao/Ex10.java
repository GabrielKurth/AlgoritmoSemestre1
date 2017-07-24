/*
 Crie um programa que simule uma calculadora simples capaz de realizar as operações
básicas. O programa deve receber 3 dados: dois números e um caractere. Este caractere
poderá ser '+', '-', ‘*' ou '/' , e representarão a operação matemática que você deseja
realizar entre os números.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Calculadora básica ***");
        System.out.print("Digite o primeiro número: ");
        float numero = Float.parseFloat(read.nextLine());
        System.out.println("+  -  *  /");
        System.out.print("Informe o operador matemático: ");
        String operador = read.nextLine();
        System.out.print("Digite o segundo número: ");
        float numero2 = Float.parseFloat(read.nextLine());
        float resultado = 0;
        switch (operador) {
            case "+":
                resultado = numero + numero2;
                System.out.printf("%.2f + %.2f = %.2f \n", numero, numero2, resultado);
                break;
            case "-":
                resultado = numero - numero2;
                System.out.printf("%.2f - %.2f = %.2f \n", numero, numero2, resultado);
                break;
            case "*":
                resultado = numero * numero2;
                System.out.printf("%.2f * %.2f = %.2f \n", numero, numero2, resultado);
                break;
            case "/":
                resultado = numero / numero2;
                System.out.printf("%.2f / %.2f = %.2f \n", numero, numero2, resultado);
                break;
            default:
                System.err.println("Operador inválido!!!");
        }
    }
}
