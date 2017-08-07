/*
Escreva um programa em Java que lê as notas de duas provas de um aluno e calcula
sua média.
Se o aluno tiver média maior ou igual a 6,0, ele passa. Caso contrário, ele fará
mais uma prova.
Nesse caso, o programa deve ler essa terceira nota e recalcular a média, 
substituindo a menor nota entre P1 e P2 pela nota da P3.
Indique a nova média do aluno e se ela conseguiu passar ou não.
Atenção: se o aluno fizer a P3, sua média máxima é 6,0.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex27 {

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

        float media = (prova1 + prova2) / 2;
        if (media >= 6) {
            System.out.printf("O aluno %s foi aprovado com média: %.2f\n", nome, media);
        } else if (media < 6) {
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
                System.out.printf("O aluno %s foi aprovado com média: %.2f\n", nome, media);
            } else {
                System.out.printf("O aluno %s foi REPROVADO com média: %.2f\n", nome, media);
            }

        }
    }
}
