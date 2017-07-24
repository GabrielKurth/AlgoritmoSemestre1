/*
Escreva um programa em Java que calcula quantos km/l seu carro está fazendo.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Autonomia do automóvel ***");
        System.out.print("Digite a quilometragem inicial: ");
        int kmInicial = Integer.parseInt(read.nextLine());
        System.out.print("Digite a quantidade de litros abastecido: ");
        float litros = Float.parseFloat(read.nextLine());
        System.out.print("Digite a quilometragem final: ");
        int kmFinal = Integer.parseInt(read.nextLine());
        float kmLitro = (kmFinal - kmInicial) / litros;
        System.out.println("--------------------------------------------------");
        System.out.printf("Quilometragem inicial: %d \n", kmInicial);
        System.out.printf("Quilometragem final: %d \n", kmFinal);
        System.out.printf("Quantidade de litros: %.3f \n", litros);
        System.out.printf("%d - %d / %.3f = %.3f \n", kmFinal, kmInicial, litros, kmLitro);
        System.out.printf("Seu automóvel faz %.3f Km/LITRO \n", kmLitro);
    }
}
