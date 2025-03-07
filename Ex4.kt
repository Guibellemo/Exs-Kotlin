package Exs1002


//4 - Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

fun main() {
    print("Digite um valor: ");
    var valor1 = readln().toInt();
    print("Digite outro valor: ");
    var valor2 = readln().toInt();
    var soma = valor1+valor2;
    println("A soma entre $valor1 e $valor2 é igual $soma");
}