package Exs1002

//9 Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
//valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 100
//Distância de 10000 Cm

fun main() {
    print("Digite uma distância em metros: ")
    var distanciaMetro = readln().toDouble();
    var distanciaCentimetro = (distanciaMetro * 100).toDouble();
    var distanciaPolegada = (distanciaMetro * 39.37).toDouble();
    println("Distância em centimetro: $distanciaCentimetro cm");
    println("Distância em polegadas: $distanciaPolegada pol");
}