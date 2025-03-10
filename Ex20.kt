package Exs1002

/*
Desenvolva um programa que leia um número inteiro e mostre seele é PAR ou ÍMPAR.
 */

fun main(){
    print("Digite um número: ");
    var numero = readln().toInt();
    imparPar(numero);
}

fun imparPar(numero : Int){
    if(numero % 2 == 0){
        println("O numero $numero é par");
    }else{
        println("O número $numero é ímpar")
    }
}