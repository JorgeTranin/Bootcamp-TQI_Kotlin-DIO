package exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] vetor = new char[6];
        int consoantes = 0;
        char[] consoantesEncontradas = new char[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um caractere: ");
            String linha = input.nextLine();
            vetor[i] = linha.charAt(0);

            if (Character.isLetter(vetor[i]) && !isVogal(vetor[i])) {
                consoantesEncontradas[consoantes] = vetor[i];
                consoantes++;
            }
        }

        System.out.println("Total de consoantes lidas: " + consoantes);
        System.out.print("Consoantes encontradas: ");
        for (int i = 0; i < consoantes; i++) {
            System.out.print(consoantesEncontradas[i] + " ");
        }
    }

    public static boolean isVogal(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

}
