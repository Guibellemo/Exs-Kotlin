package Exs1002


/*
Faça um algoritmo que leia a largura e altura de uma parede,
calcule e mostre a área a ser pintada e a quantidade de tinta
necessária para o serviço, sabendo que cada litro de tinta pinta
uma área de 2metros quadrados.


 */

fun main(){
    println("Digite a altura: ")
    var alturaInput = readln().toDouble();

    println("Digite a largura: ")
    var larguraInput = readln().toDouble();

    var parede = Parede(alturaInput, larguraInput);

    Tinta(parede);



}

fun Parede(altura: Double, largura: Double): Double{

    var area = (altura * largura).toDouble();
    println("Sua área é: " + area + "m²");
    return area;
}

fun Tinta(area : Double){
    var litros = (area/2);
    println("Total de litros: " + litros + "l");
}
