package Exs1002

/*
Faça um programa que leia o ano de nascimento de uma pessoa,
calcule a idade dela e depois mostre se ela pode ou não votar.
 */

fun main(){
    print("Digite sua idade: ");
    var idade = readln().toInt();
    PodeVotar(idade);
}

fun PodeVotar(idade : Int){
    if (idade > 16){
        println("Você pode votar!");
    }else{
        println("Você não pode votar!");
    }
}