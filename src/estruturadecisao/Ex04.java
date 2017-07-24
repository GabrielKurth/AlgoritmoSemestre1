/*
Construir um programa para identificar quantos dias há em um mês, sabendo o mês e
o ano.
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Dias do mês ***");
        System.out.print("Digite o ano: ");
        int ano = Integer.parseInt(read.nextLine());
        System.out.print("Digite o mês: ");
        int mes = Integer.parseInt(read.nextLine());
        switch (mes) {
            case 1:
                System.out.println("Janeiro possui 31 dias!");
                break;
            case 2:
                if (ano % 4 == 0) {
                    System.out.println("O ano é bissexto, então Fevereiro possui 29 dias");
                } else {
                    System.out.println("O ano não é bissexto, então Fevereiro possui 28 dias");
                }
                break;
            case 3:
                System.out.println("Março possui 31 dias!");
                break;
            case 4:
                System.out.println("Abril possui 30 dias!");
                break;
            case 5:
                System.out.println("Maio possui 31 dias!");
                break;
            case 6:
                System.out.println("Junho possui 30 dias!");
                break;
            case 7:
                System.out.println("Julho possui 31 dias!");
                break;
            case 8:
                System.out.println("Agosto possui 31 dias!");
                break;
            case 9:
                System.out.println("Setembro possui 30 dias!");
                break;
            case 10:
                System.out.println("Outubro possui 31 dias!");
                break;
            case 11:
                System.out.println("Novembro possui 30 dias!");
                break;
            case 12:
                System.out.println("Dezembro possui 31 dias!");
                break;
            default:
                System.err.println("Mês INVÁLIDO!!!");
        }
    }
}
