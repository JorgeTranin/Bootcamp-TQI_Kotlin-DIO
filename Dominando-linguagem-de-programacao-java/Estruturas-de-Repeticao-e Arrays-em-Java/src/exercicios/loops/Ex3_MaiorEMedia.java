package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;

        int cont = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }


            media = media + numero;

            cont++;

        } while (cont < 5);


        System.out.println("A Media destes numero são: " + (media / 5));
        System.out.println("O maior numero é: " + maior);


    }


}
