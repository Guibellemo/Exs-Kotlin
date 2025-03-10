package Exs1002

/*
Faça um algoritmo que pergunte a distância que um
passageiro deseja percorrer em Km. Calcule o preço da
passagem, cobrando R$0.50 por Km para viagens até 200Km e
R$0.45 para viagens mais longas
 */

fun main(){
    println("Quantos km deseja percorre?");
    var km = readln().toInt();
    gasto(km);
}

fun gasto(km : Int){
    if (km > 200){
        var gasto = km * 0.45;
        println("Valor $gasto")
    }else{
        var gasto = km * 0.5;
        println("Valor $gasto")
    }
}