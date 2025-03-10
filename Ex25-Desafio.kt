package Exs1002

/*
[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
Matematicamente, para três segmentos formarem um triângulo,
o comprimento de cada lado deve ser menor que a soma dos outros dois.
 */

fun main(){
    print("Entre com o tamanho do primeiro lado: ");
    var lado1 = readln().toDouble();
    print("Entre com o tamanho do segundo lado: ");
    var lado2 = readln().toDouble();
    print("Entre com o tamanho do terceiro lado: ");
    var lado3 = readln().toDouble();
    triangulo(lado1, lado2, lado3);
}

fun triangulo(lado1: Double, lado2: Double, lado3: Double){
    if (lado1 < lado2 + lado3 && lado2 < lado3 + lado1 && lado3 < lado1 + lado2){
        println("É possível formar um triangulo");
    }else{
        println("Não é possível formar um triangulo");
    }
}