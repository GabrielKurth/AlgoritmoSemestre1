/*
Crie um programa para informar quais e quantas notas são necessárias para 
entregar o mínimo de cédulas para um determinado valor informado pelo usuário, 
Considere notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve mostrar
apenas as notas utilizadas. Por exemplo, ao solicitar R$18, o programa deve 
informar apenas a seguinte informação (note que não foram exibidas informações
sobre as demais cédulas):
1 nota(s) de R$ 10.
1 nota(s) de R$ 5.
3 nota(s) de R$ 1.
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Notas
        int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;
        System.out.println("*** Saque ***");
        System.out.println("Cédulas disponivéis:\n100, 50, 10, 5, 1");
        System.out.print("Digite o valor solicitado: R$ ");
        int saque = read.nextInt();
        nota100 = saque / 100;
        saque = saque - (nota100 * 100);
        nota50 = saque / 50;
        saque = saque - (nota50 * 50);
        nota10 = saque / 10;
        saque = saque - (nota10 * 10);
        nota5 = saque / 5;
        saque = saque - (nota5 * 5);
        nota1 = saque / 1;
        saque = saque - (nota1 * 1);
        System.out.println(" ---------------------");
        System.out.println("| Quantidade de notas |");
        if (nota100 >= 1) {
            System.out.printf("|  Notas de 100: %d    | \n", nota100);
        }
        if (nota50 >= 1) {
            System.out.printf("|  Notas de 50: %d     | \n", nota50);
        }
        if (nota10 >= 1) {
            System.out.printf("|  Notas de 10: %d     | \n", nota10);
        }
        if (nota5 >= 1) {
            System.out.printf("|  Notas de 5: %d      | \n", nota5);
        }
        if (nota1 >= 1) {
            System.out.printf("|  Notas de 1: %d      | \n", nota1);
        }
        System.out.println(" ---------------------");
    }
}
