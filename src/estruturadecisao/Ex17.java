/*
Uma conta telefônica é composta pelos seguintes itens:
    Assinatura: R$ 23,32
    Ligações Locais: R$ 0,09 / min
    Ligações Interurbanas (DDD): R$ 0,26 / min
    Ligações Internacionais (DDI): R$ 0,86 / min
Escreva um algoritmo que lê os minutos gastos em cada tipo de ligação e que 
mostra o valor a ser pago em cada um dos itens e, também, o valor total.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Conta telefônica ***");
        float assinatura = 23.32f;
        System.out.print("Digite os minutos gastos com ligações locais: ");
        float minLocais = Float.parseFloat(read.nextLine());
        System.out.print("Digite os minutos gastos com ligações interurbanas(DDD): ");
        float minDdd = Float.parseFloat(read.nextLine());
        System.out.print("Digite os minutos gastos com ligações internacionais(DDI): ");
        float minDdi = Float.parseFloat(read.nextLine());
        double totalLocais = minLocais * 0.09;
        double totalDdd = minDdd * 0.26;
        double totalDdi = minDdi * 0.86;
        double totalConta = totalLocais + totalDdd + totalDdi + assinatura;
        System.out.printf("--------------------------- TelexFibra ---------------------------\n\n"
                + "Tipo                                   Minutos                  Total\n"
                + "Ligações Locais                           %.0f/min             R$%.2f\n"
                + "Ligações Interurbanas(DDD)                %.0f/min             R$%.2f\n"
                + "Ligações Internacionais(DDI)              %.0f/min             R$%.2f\n"
                + "Assinatura                                                     R$%.2f\n"
                + "----------------------------------------------------------------------\n\n"
                + "                                                  Total fatura: R$%.2f\n",
                minLocais, totalLocais, minDdd, totalDdd, minDdi, totalDdi, assinatura, totalConta);
    }
}
