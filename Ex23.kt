package Exs1002

/*
Numa promoção exclusiva para o Dia da Mulher, uma loja quer
dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do clientee calcule o preço com desconto.
Sabendo que:
• Homens ganham 5% de desconto
• Mulheres ganham 13% de desconto
 */

fun main(){
    println("Digite o seu nome:")
    var nome = readln().toString();
    println("Digite seu sexo:")
    var sexo = readln().toString();
    println("Digite quanto você gastou:")
    var gasto = readln().toDouble();
    desconto(nome, sexo, gasto);
}

fun desconto(nome: String, sexo: String, gasto: Double) {
    if (sexo == "Mulher"){
        var valorComDesconto = gasto * (1-0.13);
        println("O valor da sua compra com desconto é: $valorComDesconto");
    }else{
        var valorComDesconto = gasto * (1-0.05);
        println("O valor da sua compra com desconto é: $valorComDesconto");
    }
}