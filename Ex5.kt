package Exs1002

//5 - Faça um programa em Kotlin que leia as duas notas de um aluno em uma matéria e
//mostre na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5

fun main() {
    print("Nota 1: ");
    var nota1 = readln().toFloat();
    print("Nota 2: ");
    var nota2 = readln().toFloat();
    var media = ((nota1 + nota2)/ 2).toFloat();
    println("A média entre $nota1 e $nota2 é igual a $media");

}