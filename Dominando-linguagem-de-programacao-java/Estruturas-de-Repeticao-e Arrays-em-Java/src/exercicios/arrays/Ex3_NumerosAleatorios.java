package exercicios.arrays;

import java.util.*;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i <= 5; i++){
            System.out.println("Digite um numero: ");
            lista.add(scan.nextInt());
        }

        System.out.println(lista);

        for (int i = 0; i <= 5; i ++){
            System.out.printf("o Sucessor de %d é %d",lista.get(i) , lista.get(i) + 1);
            System.out.println();
        }


    }

}
