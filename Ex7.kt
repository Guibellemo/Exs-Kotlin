package Exs1002

//8 Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
//e a sua terça parte.
//Ex: Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

fun main() {
    print("Digite um número: ");
    var numero = readln().toDouble();
    var dobro = numero*2.toDouble();
    var tercaParte = numero/3.toDouble();
    println("O dobrro de $numero é $dobro");
    println("A terça parte de $numero é $tercaParte");
}