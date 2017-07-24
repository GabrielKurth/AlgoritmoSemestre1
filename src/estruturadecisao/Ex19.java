/*
Escreva um programa que lê o nome de uma pessoa e mostra a seguinte mensagem: "Olá, nome da pessoa!".
Se a pessoa não entrar com um nome, o programa deve mostrar: "Olá, mundo!".
*/
package estruturadecisao;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Saudação ***");
        System.out.print("Digite o seu nome: ");
        String nome = read.nextLine();
        nome = nome.toUpperCase();
        int tamanhoNome = nome.length();
        if (tamanhoNome < 2) {
            System.out.println("Olá Mundo!!!");
        } else {
            System.out.println("Olá " + nome);
        }
    }
}
