// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class MudancaparaIrlanda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura do salário e dos benefícios
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();

        double imposto;

        double salarioLiquido = 0;
        //TODO: Implemente as regras para o cálculo do imposto.
        if (salarioBruto <= 1100.0){
            imposto = (salarioBruto * 5) / 100 ;
            salarioLiquido = salarioBruto - imposto + beneficios;
        }
        if (salarioBruto >= 1100.01){
            imposto = (salarioBruto * 10) / 100 ;
            salarioLiquido = salarioBruto - imposto + beneficios;
        }
        if (salarioBruto >= 2500.0){
            imposto = (salarioBruto * 15) / 100 ;
            salarioLiquido = salarioBruto - imposto + beneficios;
        }


        //TODO: Imprimir o salário líquido com 2 casas decimais.
        System.out.printf("%.2f\n", salarioLiquido);
    }
}