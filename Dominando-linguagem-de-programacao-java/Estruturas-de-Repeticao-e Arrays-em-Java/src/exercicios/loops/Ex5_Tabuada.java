package exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer ver a tabuada de qual numero? ");
        int tatuada = scan.nextInt();

        int cout = 1;
        System.out.println("Tabuada de : "+ tatuada);
        while (cout <= 10){

            System.out.printf("%d X %d = %d", tatuada, cout, (tatuada * cout));
            System.out.println("");
            cout++;
        }

    }

}
