/*
Crie um programa para validar CPF (o usuário informa os onze dígitos do documento
e ele informa se o número informado é válido ou não). Um CPF é composto de 11
dígitos, em que os dois últimos são os dígitos verificadores. Para ser válido, o primeiro
e o segundo dígitos do CPF informado devem ser iguais a determinados valores, como
descrito abaixo.
Para validação do CPF da pessoa, utilize a seguinte estratégia.
Passo 1:
Multiplique o 1° dígito do CPF por 10
Multiplique o 2° dígito do CPF por 9
Multiplique o 3° dígito do CPF por 8
Multiplique o 4° dígito do CPF por 7
Multiplique o 5° dígito do CPF por 6
Multiplique o 6° dígito do CPF por 5
Multiplique o 7° dígito do CPF por 4
Multiplique o 8° dígito do CPF por 3
Multiplique o 9° dígito do CPF por 2
Passo 2:
Some os resultados das multiplicações anteriores.
Passo 3:
Encontre o resto da divisão da soma anterior por 11
Passo 4:
Subtraia o resto obtido no passo anterior de 11.
Passo 5:
Se o resultado da subtração for menor que 10, compare-o com o 10° dígito do CPF; se
não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido e os
passos seguintes podem ser ignorados.
Passo 6:
Multiplique o 1° dígito do CPF por 11
Multiplique o 2° dígito do CPF por 10
Multiplique o 3° dígito do CPF por 9
Multiplique o 4° dígito do CPF por 8
Multiplique o 5° dígito do CPF por 7
Multiplique o 6° dígito do CPF por 6
Multiplique o 7° dígito do CPF por 5
Multiplique o 8° dígito do CPF por 4
Multiplique o 9° dígito do CPF por 3
Multiplique o 10° dígito do CPF por 2
Passo 7:
Some os resultados das multiplicações anteriores do passo anterior
Passo 8:
Encontre o resto da divisão da soma do passo anterior por 11
Passo 9:
Subtraia o resto obtido no passo anterior de 11
Passo 10:
Se o resultado da subtração for menor que 10, compare-o com o 11° dígito do CPF; se
não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido. Se não
for, o CPF é válido.
Exemplo: 111.222.333-44 é válido?
Soma1 = 1*10 + 1*9 + 1*8 +2*7 +2*6 + 2*5 + 3*4 + 3*3 + 3*2 = 90
Digito1 = 11 – (soma % 11) = 11 – 2 = 9
Soma2 = 1*11 + 1*10 + 1*9 + 2*8 + 2*7 + 2*6 + 3*5 + 3*4 + 3*3 + 9*2 = 126
Digito2 = 11 – 5 = 6
111.222.333-44 não é válido! Para ser válido, deveria ser 111.222.333-96.
 */
package estruturadecisao;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("*** CPF ***");
        System.out.print("Digite o seu CPF(Sem pontos ou traços): ");
        String cpf = read.nextLine();
        int tamanho = cpf.length();
        if (tamanho != 11) {
            System.err.println(" ----------------------------------");
            System.err.println("|                                  |");
            System.err.println("|Quantidade de caracteres inválida!|");
            System.err.println("|                                  |");
            System.err.println(" ----------------------------------\n");
        }
        //Separando os digitos
        String separaDig11 = cpf.substring(10);
        String separaDig10 = cpf.substring(9, 10);
        String separaDig9 = cpf.substring(8, 9);
        String separaDig8 = cpf.substring(7, 8);
        String separaDig7 = cpf.substring(6, 7);
        String separaDig6 = cpf.substring(5, 6);
        String separaDig5 = cpf.substring(4, 5);
        String separaDig4 = cpf.substring(3, 4);
        String separaDig3 = cpf.substring(2, 3);
        String separaDig2 = cpf.substring(1, 2);
        String separaDig1 = cpf.substring(0, 1);
        //Convertendo String para INT
        int digito1 = Integer.parseInt(separaDig1);
        int digito2 = Integer.parseInt(separaDig2);
        int digito3 = Integer.parseInt(separaDig3);
        int digito4 = Integer.parseInt(separaDig4);
        int digito5 = Integer.parseInt(separaDig5);
        int digito6 = Integer.parseInt(separaDig6);
        int digito7 = Integer.parseInt(separaDig7);
        int digito8 = Integer.parseInt(separaDig8);
        int digito9 = Integer.parseInt(separaDig9);
        int digito10 = Integer.parseInt(separaDig10);
        int digito11 = Integer.parseInt(separaDig11);

        //Passo 1
        int multDigito1 = digito1 * 10;
        int multDigito2 = digito2 * 9;
        int multDigito3 = digito3 * 8;
        int multDigito4 = digito4 * 7;
        int multDigito5 = digito5 * 6;
        int multDigito6 = digito6 * 5;
        int multDigito7 = digito7 * 4;
        int multDigito8 = digito8 * 3;
        int multDigito9 = digito9 * 2;

        //Passo 2
        int somaPasso2 = multDigito1 + multDigito2 + multDigito3 + multDigito4
                + multDigito5 + multDigito6 + multDigito7 + multDigito8 + multDigito9;

        //Passo 3
        int restoPasso3 = somaPasso2 % 11;

        //Passo 4
        int subPasso4 = 11 - restoPasso3;

        //Passo 5
        if (subPasso4 != 10) {
            if (subPasso4 != digito10) {
                if (subPasso4 != 0) {
                    System.err.println(" ----------------");
                    System.err.println("|               |");
                    System.err.println("| CPF inválido! |");
                    System.err.println("|               |");
                    System.err.println(" ----------------\n");
                    System.exit(1);
                }
            }
        }

        //Passo 6
        digito1 = digito1 * 11;
        digito2 = digito2 * 10;
        digito3 = digito3 * 9;
        digito4 = digito4 * 8;
        digito5 = digito5 * 7;
        digito6 = digito6 * 6;
        digito7 = digito7 * 5;
        digito8 = digito8 * 4;
        digito9 = digito9 * 3;
        digito10 = digito10 * 2;

        //Passo 7
        int somaPasso7 = digito1 + digito2 + digito3 + digito4 + digito5 + digito6
                + digito7 + digito8 + digito9 + digito10;

        //Passo 8
        int restoPasso8 = somaPasso7 % 11;

        //Passo 9
        int subPasso9 = 11 - restoPasso8;

        //Passo 10
        if (subPasso9 != 10) {
            if (subPasso9 != digito11) {
                if (subPasso9 != 0) {
                    System.err.println(" ----------------");
                    System.err.println("|               |");
                    System.err.println("| CPF inválido! |");
                    System.err.println("|               |");
                    System.err.println(" ----------------\n");
                    System.exit(1);
                }
            }
        }
        System.out.println(" --------------");
        System.out.println("|             |");
        System.out.println("| CPF válido! |");
        System.out.println("|             |");
        System.out.println(" --------------\n");
    }
}