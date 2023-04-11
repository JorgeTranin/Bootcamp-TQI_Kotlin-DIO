package exercicios.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> lista = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        System.out.print("Lista em ordem inversa: ");

        // Inverte a ordem dos elementos da lista
        Collections.reverse(lista);

        // Imprime a lista em ordem inversa
        System.out.println(lista);
    }
}
