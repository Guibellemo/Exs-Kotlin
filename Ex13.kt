package Exs1002

/*
Faça um algoritmo que leia o salário de um funcionário,
calcule e mostre o seu novo salário, com 15% de aumento.
 */

fun main(){
    print("Digite o salario: ")
    var salario = readln().toDouble();
    var acrescimo = salario*(1+0.15).toDouble();
    println("Seu novo salario acrescido de 15% é: R$ " + acrescimo);

}