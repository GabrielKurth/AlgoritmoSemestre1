/*
Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
idade do conveniado, considerando que todos pagam R$ 100 mais um adicional
conforme a seguinte tabela:
1) crianças com menos de 10 anos pagam R$80;
2) conveniados com idade entre 10 e 30 anos pagam R$50;
3) conveniados com idade entre 40 e 60 anos pagam R$ 95;
4) conveniados com mais de 60 anos pagam R$130.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Preço do plano de saúde ***");
        int precoPlano = 100;
        System.out.print("Digite a idade do conveniado: ");
        int idade = Integer.parseInt(read.nextLine());
        if (idade < 10) {
            precoPlano = precoPlano + 80;
        } else if (idade >= 10 && idade <= 30) {
            precoPlano = precoPlano + 50;
        } else if (idade > 30 && idade <= 60) {
            precoPlano = precoPlano + 95;
        } else if (idade > 60) {
            precoPlano = precoPlano + 80;
        } else {
            System.err.println("Idade Inválida!!!");
        }
        System.out.printf("Idade: %d\nPreço do plano: %d \n", idade, precoPlano);
    }
}
