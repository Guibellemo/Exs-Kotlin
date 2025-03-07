package Exs1002

//3 Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
//mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.


fun main(){
    print("Nome do funcionário: ");
    var nome = readln().toString();
    print("Salário: ");
    var salario = readln().toDouble();
    println("O funcionário "+ nome +" tem um salário de " + salario + " em junho.")
}