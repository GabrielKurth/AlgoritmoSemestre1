/*
Você está indo viajar para o exterior e vê na previsão do tempo que as 
temperaturas estão na casa de 32°F. Será que isso é quente? É frio? Melhor se prevenir:
Escreva um algoritmo que lê o valor de uma temperatura em °F e a mostra convertida para °C.
Fórmula: C = \frac{5}{9} \cdot (F - 32)
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Conversão de temperatura ***");
        System.out.print("Insira a temperatura em Fahrenheit: ");
        double fahr = Double.parseDouble(read.nextLine());
        double celsius = (fahr - 32) * 5 / 9;
        System.out.printf("%.1f ºF = %.1fºC\n", fahr, celsius);
    }
}
