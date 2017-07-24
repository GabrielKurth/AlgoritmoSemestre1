/*
Crie um programa que verifica se um número inteiro informado pelo usuário é
divisível por 3.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Divisível por 3 ***");
        System.out.print("Digite um número: ");
        int numero = read.nextInt();
        if (numero % 3 == 0) {
            System.out.printf("O número digitado foi: %d - Divisível por 3!\n", numero);
        } else {
            System.out.printf("O número digitado foi: %d - Não divisível por 3! \n", numero);
        }
    }
}
