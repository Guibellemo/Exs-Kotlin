package Exs1002

import kotlin.math.pow

/*
• Desenvolva uma lógica que leia os valores de A, B e C de
uma equação do segundo grau e mostre o valor de Delta.
 */

fun main(){
    println("Entre com os valores de A, B e C: ");
    print("A: ");
    var a = readln().toDouble();
    print("B: ");
    var b = readln().toDouble();
    print("C: ");
    var c = readln().toDouble();

    println(Delta(a,b,c));

}

fun Delta(A:Double,B:Double, C:Double): Double{
    var delta = (B.pow(2)- 4 * A * C).toDouble();
    return delta;
}