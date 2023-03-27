# dio-desafios-de-codigo-kotlin

# Refinando Sua Técnica Com Desafios de Código em Kotlin

## 🛑 Pré-Requisitos

<p>
✅ Conhecer a sintaxe da linguagem de programação Kotlin<br>
✅ Java JDK 17<br>
✅ IDE para desenvolvimento Kotlin (utilizei IntelliJ)<br>
</p>


## Entenda o Objetivo de cada Desafio:

## **Desafio**: Suas Primeiras Condições em Kotlin

Faça um programa que receba:

    Caso a média seja < 5 imprima "REP"
    Caso a média seja >= 5 e < 7 imprima "REC"
    Caso a média seja >7 imprima "APR"

## Entrada
A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno. Conforme mostrado no exemplo de entrada a seguir.

## Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra "Reprovado" caso sua média seja < 5, "Recuperação" caso sua média seja >= 5 e < 7 e "Aprovado" caso a média seja > 7. Use o exemplo abaixo para clarear o que está sendo pedido.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|        5.5          |       REC         |
|         8           |       APR         |
|         2           |       REP         |

- [Clique aqui para acessar o Código.]()

-----

## **Desafio**: Avançando Tecnicamente Com a Expressão When
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

## Entrada
As entradas serão <b>datas em formato numeral</b>. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

## Saida
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|       19/10/1997    | 19 de Outubro de 1997        |
|       25/12/2019    | 25 de Dezembro de 2019       |
|       02/02/2020    | 02 de Fevereiro de 2020      |

- [Clique aqui para acessar o Código.]()

-----

## **Desafio**: Explorando Mapas, Loops e Regras com Kotlin
Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M. Cada um com seu respectivo valor: <br><br>

    I : 1    
    V : 5   
    X : 10   
    L : 50   
    C : 100  
    D : 500  
    M : 1000

Eles são geralmente escritos do maior para o menor. Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.

## Entrada
Você receberá uma entrada em numeral romano.

## Saída
Você deverá imprimir o numeral romano convertido para um número inteiro.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|       "V"           |       5           |
|       "II"          |       2           |
|       "MCII"        |       1102        |

- [Clique aqui para acessar o Código.]()

-----

## **Desafio**: Utilizando a Keyword Object com Orientação a Objetos (OO)
Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.<br>

Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios.<br>
O salário a ser transferido é calculado da seguinte maneira: <br><br>

<b>(valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios</b><br>

Para calcular o <b>percentual de imposto</b> segue as aliquotas:<br>

    De R$ 0.00 a R$ 1100.00 = 5.00% 
    De R$ 1100.01 a R$ 2500.00 = 10.00%
    Maior que R$ 2500.00 = 15.00%

## Entrada
A entrada consiste em vários arquivos de teste, que conterá o <b>valor bruto do salário</b> e <b>adicional dos benefícios</b>. Conforme mostrado no exemplo de entrada a seguir.

## Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salárial somado com o adicional dos benefícios. Use o exemplo abaixo para clarear o que está sendo pedido.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|        2000         |       2050.0       |
|        250          |                    |


- [Clique aqui para acessar o Código.]()

-----

## **Desafio**: Orientação a Objetos (OO) Visando Soluções Mais Idiomáticas
Supondo que a população de um país A tenha N habitantes com uma taxa anual de crescimento de 3% e que a população de B M habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. <br>

Obs: O valor inicial da população A deverá ser sempre menor que do país B

## Entrada
A entrada consiste em dois valores inteiros, sendo N a população do país A e M a população do país B.

## Saída
A saída consiste em retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B, mantidas as taxas de crescimento.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|        80000        |       16 anos     |
|       100000        |                   |


| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|        100000        |       48 anos    |
|       200000         |                  |


- [Clique aqui para acessar o Código.]()