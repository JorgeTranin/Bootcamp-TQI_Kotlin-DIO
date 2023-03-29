public class OperadoresRelacionais {


    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'x';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1000L;
        long l2 = 2000L;
        short sh1 = 10;
        byte y1 = 5;
        byte y2 = 3;

// Comparação de igualdade (==)
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("s1 == s2: " + (s1 == s2));

// Comparação de diferença (!=)
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("f1 != f2: " + (f1 != f2));

// Comparação de maior que (>)
        System.out.println("i2 > i1: " + (i2 > i1));
        System.out.println("f2 > f1: " + (f2 > f1));

// Comparação de menor que (<)
        System.out.println("i1 < i2: " + (i1 < i2));
        System.out.println("f1 < f2: " + (f1 < f2));

// Comparação de maior ou igual (>=)
        System.out.println("i2 >= i1: " + (i2 >= i1));
        System.out.println("f2 >= f1: " + (f2 >= f1));

// Comparação de menor ou igual (<=)
        System.out.println("i1 <= i2: " + (i1 <= i2));
        System.out.println("f1 <= f2: " + (f1 <= f2));

// Comparação lógica de igualdade (==)
        System.out.println("l1 == l2: " + (l1 == l2));
        System.out.println("sh1 == b1: " + (sh1 == y1));

// Comparação lógica de diferença (!=)
        System.out.println("l1 != l2: " + (l1 != l2));
        System.out.println("b1 != b2: " + (b1 != b2));

// Comparação lógica de maior que (>)
        System.out.println("l2 > l1: " + (l2 > l1));
        System.out.println("sh1 > b1: " + (sh1 > y1));

// Comparação lógica de menor que (<)
        System.out.println("l1 < l2: " + (l1 < l2));
        System.out.println("b2 < b1: " + (y2 < y1));
// Comparação que dariam erros
        // System.out.println("i1 == l1: " + (i1 == l1));
        //System.out.println("b1 == f1: " + (b1 == f1));

    }
}
