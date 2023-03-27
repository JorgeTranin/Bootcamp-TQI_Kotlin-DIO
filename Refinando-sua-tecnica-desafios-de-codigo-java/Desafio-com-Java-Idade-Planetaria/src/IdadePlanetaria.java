// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.



import java.util.Scanner;

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();

        double idadePlanetaria;

        //TODO: Crie as condições para calcular a idade equivalente de cada planeta.


        if (planeta.equals("Marte")) {
            idadePlanetaria = idadeTerrestre / 1.88;
        } else if (planeta.equals("Venus")) {
            idadePlanetaria = idadeTerrestre / 0.62;
        } else if (planeta.equals("Jupiter")) {
            idadePlanetaria = idadeTerrestre / 11.86;
        } else {
            System.out.println("Planeta invalido.");
            return;
        }

        //TODO: Imprima a saída conforme descrito neste desafio.
        System.out.printf("Idade equivalente em %s: %.2f anos\n", planeta, idadePlanetaria);

        scanner.close();
    }
}
