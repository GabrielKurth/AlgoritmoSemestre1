/*
Escreva um algoritmo que lê o nome de um funcionário, o seu nível dentro do 
plano de carreira da empresa e a quantidade de horas que ele trabalhou. O 
algoritmo deve calcular o valor do salário a ser pago e mostrar a seguinte 
mensagem: “O funcionário Nome do Funcionário trabalhou Horas Trabalhadas horas 
por R$ Valor da Hora (Nível Nível do Funcionário) e deve receber R$ Valor do Salário“.
O plano de carreira da empresa segue a tabela abaixo:
Nível 	Valor da Hora
1 	R$ 15,00
2 	R$ 18,00
3 	R$ 22,00
4 	R$ 27,00
5 	R$ 33,00
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Salário com plano de carreira ***");
        System.out.print("Digite o nome do funcionário: ");
        String nome = read.nextLine();
        nome = nome.toUpperCase();
        System.out.print("Digite o nível do plano de carreira: ");
        int carreira = Integer.parseInt(read.nextLine());
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        float hora = Float.parseFloat(read.nextLine());
        float salario = 0;

        switch (carreira) {
            case 1:
                salario = hora * 15;
                System.out.printf("O funcionário %s trabalhou %.1f horas por R$15,00(Plano"
                        + " de carreira: %d) e deve receber R$%.2f \n", nome, hora, carreira, salario);
                break;
            case 2:
                salario = hora * 18;
                System.out.printf("O funcionário %s trabalhou %.1f horas por R$18,00(Plano"
                        + " de carreira: %d) e deve receber R$%.2f \n", nome, hora, carreira, salario);
                break;
            case 3:
                salario = hora * 22;
                System.out.printf("O funcionário %s trabalhou %.1f horas por R$22,00(Plano"
                        + " de carreira: %d) e deve receber R$%.2f \n", nome, hora, carreira, salario);
                break;
            case 4:
                salario = hora * 27;
                System.out.printf("O funcionário %s trabalhou %.1f horas por R$27,00(Plano"
                        + " de carreira: %d) e deve receber R$%.2f \n", nome, hora, carreira, salario);
                break;
            case 5:
                salario = hora * 33;
                System.out.printf("O funcionário %s trabalhou %.1f horas por R$33,00(Plano"
                        + " de carreira: %d) e deve receber R$%.2f \n", nome, hora, carreira, salario);
                break;
            default:
                System.err.println("Nível incorreto!");
        }
    }
}
