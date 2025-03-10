package Exs1002

/*
Faça um algoritmo que leia um determinado ano e mostre se
ele é ou não BISSEXTO.
 */

fun main(){
    print("Digite um ano: ");
    var ano = readln().toInt();
    bissexto(ano);
}

fun bissexto(ano : Int){
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0 && ano % 100 == 0)){
        println("O ano é bissexto");
    }else{
        println("Não é bissexto");
    }
}
