package Exs1002

/*
• Escreva um algoritmo que leia dois números inteiros e compareos, mostrando na tela uma das mensagens abaixo:
• O primeiro valor é o maior
• O segundo valor é o maior
• Não existe valor maior, os dois são iguais
 */

fun main(){
    println("Entre com o primeiro valor");
    var numero1 = readln().toInt();
    println("Entre com o segundoo valor");
    var numero2 = readln().toInt();
    comparacao(numero1, numero2);
}

fun comparacao(numero1: Int, numero2: Int){
    if (numero1 > numero2){
        println("O primeiro valor é o maior.");
    }else if (numero1 < numero2){
        println("O segundo valor é o maior.");
    }else{
        println("Não existe valor maior, os dois são iguais.");
    }
}