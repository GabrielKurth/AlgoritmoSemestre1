/*
Escreva um algoritmo que lê o nome de um funcionário, o valor da sua hora de 
trabalho e a quantidade de horas que ele trabalhou. O algoritmo deve calcular o 
valor do salário a ser pago e mostrar a seguinte mensagem: “O funcionário Nome 
do Funcionário trabalhou Horas Trabalhadas horas por R$ Valor da Hora e deve 
receber R$ Valor do Salário“.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Salario ***");
        System.out.print("Digite o nome do funcionário: ");
        String nome = read.nextLine();
        nome = nome.toUpperCase();
        System.out.print("Digite o valor de cada hora: ");
        float valorHora = Float.parseFloat(read.nextLine());
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        float hora = Float.parseFloat(read.nextLine());
        float salario = valorHora * hora;
        System.out.printf("O funcionário: %s trabalhou %.1f horas por R$%.2f "
                + "e deve receber: R$%.2f \n", nome, hora, valorHora, salario);
    }
}
