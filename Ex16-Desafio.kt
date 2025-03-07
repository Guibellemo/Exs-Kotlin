package Exs1002
/*
Escreva um programa em kotlin para calcular a redução do tempo de vida
de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */


fun main(){
    println("Entre com o número de anos fumando:")
    var anosFumados = readln().toInt();

    println("Entre com o número de cigarros fumado por dia:")
    var cigarroPorDia = readln().toInt();

    var cigarrosNaVida = (365 * cigarroPorDia * anosFumados).toInt();

    var minutosPerdidosNaVida = (cigarrosNaVida * 10).toInt();

    var diasPerdidosNaVida = (minutosPerdidosNaVida / 1440).toInt();

    println("Você perdeu aproximadamente " + diasPerdidosNaVida + " dias de vida.");



}

