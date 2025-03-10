package Exs1002

/*
Crie um algoritmo que leia o nome e as duas notas de um aluno,calcule a sua média e mostre na tela.
No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).
 */

fun main(){
    print("Digite a primeira nota: ");
    var nota1 = readln().toDouble();

    print("Digite a primeira nota: ");
    var nota2 = readln().toDouble();

    Media(nota1, nota2)
}


fun Media(nota1: Double, nota2: Double): Double {
    var media = (nota1 + nota2) / 2;
    println("Sua media é: $media");
    return media;
}