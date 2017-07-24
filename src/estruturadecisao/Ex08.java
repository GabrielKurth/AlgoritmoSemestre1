/*
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma
associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de
juros (com juros sobre juros). Por exemplo, uma associação de R$100 paga em janeiro,
custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro,
R$171,03.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Multa da anuidade ***");
        System.out.print("Digite o valor da anuidade: ");
        double anuidade = Float.parseFloat(read.nextLine());
        System.out.println("\nMulta de 5% ao mês");
        System.out.print("Digite o mês que o pagamento foi efetuado(1-12): ");
        int mes = Integer.parseInt(read.nextLine());
        switch (mes) {
            case 1:
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 2:
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 3:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 4:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 5:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 6:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 7:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 8:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 9:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 10:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 11:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            case 12:
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                anuidade = (anuidade * 0.05) + anuidade;
                System.out.printf("Preço final: %.2f \n", anuidade);
                break;
            default:
                System.err.println("Mês inválido!!!");
        }
    }
}
