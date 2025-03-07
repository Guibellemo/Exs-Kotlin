package Exs1002

/*
Crie um programa que leia o número de dias trabalhados em um
mês e mostre o salário de um funcionário, sabendo que ele trabalha
8 horas por dia e ganha R$25 por hora trabalhada.
 */

fun main(){
    print("Quantos dias foram trabalhados? ");
    var diasTrabalhados = readln().toInt();
    var salario = 25 * 8 * diasTrabalhados.toDouble();
    println("O salario é de: R$$salario");
}