package Exs1002

//10 Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
//R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
//cotação atual)

fun main() {
    print("Digite quanto de dinheiro você tem? R$ ")
    var dinheiro = readln().toDouble();
    var dolar = dinheiro/6.toDouble();
    println("Você pode comprar US$ " + String.format("%.2f", dolar));
}