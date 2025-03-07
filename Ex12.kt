package Exs1002

/*
*Crie um programa que leia o preço de um produto, calcule e
mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.
 */

fun main(){
    print("Digite o valor do produto: ")
    var preco = readln().toDouble();
    var desconto = (preco*(1-0.05)).toDouble();
    println("Preço com 5% de desconto é: "+desconto);
}