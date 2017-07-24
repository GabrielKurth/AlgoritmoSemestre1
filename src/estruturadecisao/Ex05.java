/*
Criar um programa para identificar se um mês digitado pelo usuário é de alta ou baixa
temporada (considerar os seguintes meses como alta temporada: dezembro a fevereiro,
junho e julho).
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Baixa ou alta temporada? ***");
        System.out.print("Digite o mês: ");
        int mes = Integer.parseInt(read.nextLine());
        switch (mes) {
            case 1:
                System.out.print("O mês digitado foi JANEIRO - 'ALTA TEMPORADA' \n");
                break;
            case 2:
                System.out.print("O mês digitado foi FEVEREIRO - 'ALTA TEMPORADA' \n");
                break;
            case 3:
                System.out.print("O mês digitado foi MARÇO - 'BAIXA TEMPORADA' \n");
                break;
            case 4:
                System.out.print("O mês digitado foi ABRIL - 'BAIXA TEMPORADA' \n");
                break;
            case 5:
                System.out.print("O mês digitado foi MAIO - 'BAIXA TEMPORADA' \n");
                break;
            case 6:
                System.out.print("O mês digitado foi JUNHO - 'ALTA TEMPORADA' \n");
                break;
            case 7:
                System.out.print("O mês digitado foi JULHO - 'ALTA TEMPORADA' \n");
                break;
            case 8:
                System.out.print("O mês digitado foi AGOSTO - 'BAIXA TEMPORADA' \n");
                break;
            case 9:
                System.out.print("O mês digitado foi SETEMBRO - 'BAIXA TEMPORADA' \n");
                break;
            case 10:
                System.out.print("O mês digitado foi OUTUBRO - 'BAIXA TEMPORADA' \n");
                break;
            case 11:
                System.out.print("O mês digitado foi NOVEMBRO - 'BAIXA TEMPORADA' \n");
                break;
            case 12:
                System.out.print("O mês digitado foi DEZEMBRO - 'ALTA TEMPORADA' \n");
                break;
            default:
                System.err.println("Mês Inválido!!!");
        }
    }

}
