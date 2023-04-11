package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont;
        int par = 0;
        int impar = 0;

        int numero;
        System.out.println("Quantos numeros você que ler? ");
        cont = scan.nextInt();

        while (cont > 0){
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();


            if (numero % 2 == 0){
                par ++;
            }else {
                impar ++;
            }


            cont --;
        }

        System.out.println("A quantidade de pares é: "+ par);
        System.out.println("A quantidade de impares é: "+ impar);

    }
}
