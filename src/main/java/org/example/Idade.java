package org.example;

import java.util.Scanner;

// java basico
public class Idade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("***calculadora idade***\n\n");

        int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;

        System.out.print("Digite os anos: ");
        IdadeAnos = input.nextInt();

        System.out.print("Digite os meses: ");
        IdadeMeses = input.nextInt();

        System.out.print("Digite os dias: ");
        IdadeDias = input.nextInt();

        IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
        System.out.println("Idade total em " + IdadeTotalDias + " dias");

    }
}