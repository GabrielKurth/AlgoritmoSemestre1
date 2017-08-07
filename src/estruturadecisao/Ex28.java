/*
Melhore o exercício anterior de forma que ele também tenha a frequência do aluno
como entrada.
O aluno só passa se sua frequência for maior ou igual a 75%
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Média do Aluno ***");
        System.out.print("Digite o nome do aluno: ");
        String nome = read.nextLine();
        nome = nome.toUpperCase();
        System.out.print("Digite a nota da P1: ");
        float prova1 = Float.parseFloat(read.nextLine());
        System.out.print("Digite a nota da P2: ");
        float prova2 = Float.parseFloat(read.nextLine());
        System.out.print("Digite a frequência do " + nome + " : ");
        int frequencia = Integer.parseInt(read.nextLine());

        float media = (prova1 + prova2) / 2;
        if (media >= 6 && frequencia >= 75) {
            System.out.printf("O aluno %s foi aprovado com média: %.2f\nFrequência: %d %\n",
                    nome, media, frequencia);
        } else if (media < 6 && frequencia >= 75) {
            System.out.println("---------------------------------------------");
            System.err.println("O aluno deve fazer a prova substitutiva!!!");
            System.out.print("Digite a nota da P3: ");
            float prova3 = Float.parseFloat(read.nextLine());
            if (prova1 <= prova2) {
                media = (prova1 + prova3) / 2;
            } else {
                media = (prova2 + prova3) / 2;
            }
            if (media > 6) {
                media = 6;
                System.out.printf("O aluno %s foi aprovado com média: %.2f\nFrequência: %d %\n",
                        nome, media, frequencia);
            } else {
                System.out.printf("O aluno %s foi REPROVADO com média: %.2f\nFrequência: %d %\n",
                        nome, media, frequencia);
            }
        } else {
            System.out.printf("O aluno %s foi REPROVADO com média: %.2f\nFrequência: %d %\n",
                    nome, media, frequencia);
        }
    }
}
