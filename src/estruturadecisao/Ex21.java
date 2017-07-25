/*
No jogo de tabuleiro War, uma batalha é decidida nos dados: um vermelho para 
cada exército no ataque e um amarelo para cada exército na defesa. Só podem 
atuar, no máximo, três exércitos de cada lado.
Após jogarem os dados, eles são comparados um a um: o maior vermelho com o maior
amarelo, o segundo maior vermelho com o segundo maior amarelo e menor vermelho 
com o menor amarelo. O maior valor vence, sendo que, em caso de empate, a defesa ganha.
Exemplo 1

No caso do atacante e do defensor jogarem ambos com 3 dados e supondo-se que o 
atacante tivesse tirado 5, 4 e 1 e o defensor 6, 3 e 1, a comparação seria feita
da seguinte forma:
Dados 	 Ataque	Defesa 	Vencedor
Maior 	 5 	  6      Defesa
2º Maior 4 	  3      Ataque
Menor 	 1 	  1      Defesa

Como se vê, o atacante teria vencido uma jogada e perdido duas, ou seja, teria 
perdido 2 exércitos e o defensor 1 exército.
Exemplo 2

No caso do atacante jogar com 2 dados e a defesa com 1 dado, supondo-se que os 
pontos tenham sido 3 e 2 para o ataque e 6 para a defesa, a comparação seria feita da seguinte forma:
Dados 	 Ataque	Defesa 	Vencedor
Maior 	 3 	  6 	 Defesa
2º Maior 2 	  – 	   –
Menor 	 – 	  –        –

Como se vê, a defesa teria vencido uma jogada, ou seja, o atacante teria perdido 1 exército.
Proposta

Escreva um programa que lê o número de exércitos atacando e o número de 
exércitos defendendo e, posteriormente, sorteia os valores do dados e mostra o 
resultado da batalha no formato da tabela do exemplo e indicando quantos exércitos cada um perdeu.
 */
package estruturadecisao;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int sorteio = random.nextInt(6) + 1;
        int ataque1 = 0, ataque2 = 0, ataque3 = 0;
        int defesa1 = 0, defesa2 = 0, defesa3 = 0;
        System.out.println("*** WAR ***");
        System.out.print("Digite a quantidade de exércitos de ataque: ");
        int QtdAtaque = Integer.parseInt(read.nextLine());
        //Sorteando os valores de cada exercito
        switch (QtdAtaque) {
            case 1:
                ataque1 = random.nextInt(6) + 1;
                break;
            case 2:
                ataque1 = random.nextInt(6) + 1;
                ataque2 = random.nextInt(6) + 1;
                break;
            case 3:
                ataque1 = random.nextInt(6) + 1;
                ataque2 = random.nextInt(6) + 1;
                ataque3 = random.nextInt(6) + 1;
                break;
            default:
                System.err.println("Número de exercitos inválido(MAX 1)");
                break;
        }
        System.out.print("Digite a quantidade de exércitos de defesa: ");
        int QtdDefesa = Integer.parseInt(read.nextLine());
        switch (QtdDefesa) {
            case 1:
                defesa1 = random.nextInt(6) + 1;
                break;
            case 2:
                defesa1 = random.nextInt(6) + 1;
                defesa2 = random.nextInt(6) + 1;
                break;
            case 3:
                defesa1 = random.nextInt(6) + 1;
                defesa2 = random.nextInt(6) + 1;
                defesa3 = random.nextInt(6) + 1;
                break;
            default:
                System.err.println("Número de exercitos inválido(MAX 1)");
                break;
        }

        //Ordenando os ataques
        int AtaqueMaior = Integer.MIN_VALUE, AtaqueMenor = Integer.MAX_VALUE, AtaqueMeio = 0;

        //Maior
        if (ataque1 >= AtaqueMaior) {
            AtaqueMaior = ataque1;
        }
        if (ataque2 >= AtaqueMaior) {
            AtaqueMaior = ataque2;
        }
        if (ataque3 >= AtaqueMaior) {
            AtaqueMaior = ataque3;
        }

        //Menor
        if (ataque1 <= AtaqueMenor) {
            AtaqueMenor = ataque1;
        }
        if (ataque2 <= AtaqueMenor) {
            AtaqueMenor = ataque2;
        }
        if (ataque3 <= AtaqueMenor) {
            AtaqueMenor = ataque3;
        }

        //Meio
        if (ataque2 >= ataque1 && ataque1 >= ataque3) {
            AtaqueMeio = ataque1;
        } else if (ataque3 >= ataque1 && ataque1 >= ataque2) {
            AtaqueMeio = ataque1;
        }
        if (ataque1 >= ataque2 && ataque2 >= ataque3) {
            AtaqueMeio = ataque2;
        } else if (ataque3 >= ataque2 && ataque2 >= ataque1) {
            AtaqueMeio = ataque2;
        }
        if (ataque2 >= ataque3 && ataque3 >= ataque1) {
            AtaqueMeio = ataque3;
        } else if (ataque1 >= ataque3 && ataque3 >= ataque2) {
            AtaqueMeio = ataque3;
        }

        //Ordenando defesas
        int DefesaMaior = Integer.MIN_VALUE, DefesaMenor = Integer.MAX_VALUE, DefesaMeio = 0;

        //Maior
        if (defesa1 >= DefesaMaior) {
            DefesaMaior = defesa1;
        }
        if (defesa2 >= DefesaMaior) {
            DefesaMaior = defesa2;
        }
        if (defesa3 >= DefesaMaior) {
            DefesaMaior = defesa3;
        }

        //Menor
        if (defesa1 <= DefesaMenor) {
            DefesaMenor = defesa1;
        }
        if (defesa2 <= DefesaMenor) {
            DefesaMenor = defesa2;
        }
        if (defesa3 <= DefesaMenor) {
            DefesaMenor = defesa3;
        }

        //Meio
        if (defesa2 >= defesa1 && defesa1 >= defesa3) {
            DefesaMeio = ataque1;
        } else if (defesa3 >= defesa1 && defesa1 >= defesa2) {
            DefesaMeio = defesa1;
        }
        if (defesa1 >= defesa2 && defesa2 >= defesa3) {
            DefesaMeio = defesa2;
        } else if (defesa3 >= defesa2 && defesa2 >= defesa1) {
            DefesaMeio = defesa2;
        }
        if (defesa2 >= defesa3 && defesa3 >= defesa1) {
            DefesaMeio = defesa3;
        } else if (defesa1 >= defesa3 && defesa3 >= defesa2) {
            DefesaMeio = defesa3;
        }

        //Comparando e exibindo
        String vencedor1 = null, vencedor2 = null, vencedor3 = null;
        if (DefesaMaior >= AtaqueMaior) {
            vencedor1 = "DEFESA";
        } else {
            vencedor1 = "ATAQUE";
        }
        if (DefesaMeio >= AtaqueMeio) {
            vencedor2 = "DEFESA";
        } else {
            vencedor2 = "ATAQUE";
        }
        if (DefesaMenor >= AtaqueMenor) {
            vencedor3 = "DEFESA";
        } else {
            vencedor3 = "ATAQUE";
        }
        System.out.printf("Dados         Ataque   Defesa      Vencedor\n"
                + "Maior           %d       %d           %s\n"
                + "Meio            %d       %d           %s\n"
                + "Menor           %d       %d           %s\n", AtaqueMaior, DefesaMaior,
                vencedor1, AtaqueMeio, DefesaMeio, vencedor2, AtaqueMenor, DefesaMenor, vencedor3);
    }
}
