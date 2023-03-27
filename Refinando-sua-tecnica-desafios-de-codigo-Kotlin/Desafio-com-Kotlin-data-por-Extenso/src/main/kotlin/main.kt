fun main() {
    val entrada: String? = readLine()
    entrada?.let {
        if (entrada.count { it == '/' } == 2) {
            val (dia, mes, ano) = entrada.split("/")
            val mesPorExtenso = gerarMesPorExtenso(mes)
            if (mesPorExtenso != "Mês Inválido!") println("$dia de $mesPorExtenso de $ano") else println("Data Inválida!")
        } else {
            println("Entrada inválida")
        }
    }
}

fun gerarMesPorExtenso(mes: String): String {
    return when (mes.toInt()) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido!"

    }
}