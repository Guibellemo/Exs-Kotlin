package Exs1002

/*
A locadora de carros precisa da sua ajuda para cobrar seus
serviços. Escreva um programa que pergunte a quantidade de Km
percorridos por um carro alugado e a quantidade de dias pelos quais
ele foi alugado. Calcule o preço total a pagar, sabendo que o carro
custa R$90 por dia e R$0,20 por Km rodado.
 */

fun main(){
    print("Quantos km foram rodados? ");
    var kilometragem = readln().toDouble();
    print("Qauntos dias ficou com o carro? ");
    var dias = readln().toInt();
    var totalAPagar = kilometragem * 0.2 + dias * 90.toDouble();
    println("Total a pagar: R$$totalAPagar")

}