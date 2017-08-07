/*
Escreva um programa em Java que lê o login e a senha de um usuário e valide sua 
autorização de acordo com a seguinte tabela:

Login           Senha
guilherme	 0f5
jair             0706
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** Login ***");
        System.out.print("Usuário: ");
        String user = read.nextLine();
        user = user.toUpperCase();
        System.out.print("Senha: ");
        String senha = read.nextLine();
        senha = senha.toUpperCase();
        if (user.equals("GUILHERME") && senha.equals("0F5")) {
            System.out.println("Login correto!");
        } else if (user.equals("JAIR") && senha.equals("0706")) {
            System.out.println("Login correto!");
        } else {
            System.err.println("Login incorreto!");
        }
    }
}
