object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when(salario) {
            in 0.0 .. 1100.0 -> 0.05
            in 1100.01 .. 2500.0 -> 0.10
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main() {
    try {
        val valorSalario = readLine()?.toDouble();
        val valorBeneficios = readLine()?.toDouble();

        valorSalario?.let { valorSalario ->
            valorBeneficios?.let { valorBeneficios ->
                val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
                val saida = valorSalario - valorImposto + valorBeneficios;
                println(String.format("%.2f", saida));
            }
        }

    } catch (e:NumberFormatException){
        println("Entrada invalida "+e)

    }

}