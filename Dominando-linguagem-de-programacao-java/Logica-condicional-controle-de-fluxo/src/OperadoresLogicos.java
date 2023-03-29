public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

// Comparação lógica de igualdade (==)
        System.out.println("b1 == b2: " + (b1 == b2)); // false
        System.out.println("b1 == b3: " + (b1 == b3)); // true

// Comparação lógica de diferença (!=)
        System.out.println("b2 != b3: " + (b2 != b3)); // true
        System.out.println("b1 != b4: " + (b1 != b4)); // true

// Combinação de comparações lógicas usando operadores booleanos
        System.out.println("(b1 == b3) && (b2 != b4): " + ((b1 == b3) && (b2 != b4))); // true
        System.out.println("(b1 == b2) || (b3 != b4): " + ((b1 == b2) || (b3 != b4))); // true

// Criando variáveis auxiliares para simplificar a expressão lógica
        boolean cond1 = (b1 == b3);
        boolean cond2 = (b2 != b4);

// Combinação das condições auxiliares usando operadores booleanos
        boolean resultado = cond1 && cond2;

// Impressão do resultado
        System.out.println("Resultado: " + resultado);

    }
}
