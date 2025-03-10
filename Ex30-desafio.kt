package Exs1002

/*
• [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
mostrar que tipo de triângulo será formado:
• EQUILÁTERO: todos os lados iguais
• ISÓSCELES: dois lados iguais
• ESCALENO: todos os
 */


fun main(){
    print("Entre com o tamanho do primeiro lado: ");
    var lado1 = readln().toDouble();
    print("Entre com o tamanho do segundo lado: ");
    var lado2 = readln().toDouble();
    print("Entre com o tamanho do terceiro lado: ");
    var lado3 = readln().toDouble();
    triangulo2(lado1, lado2, lado3);
}

fun triangulo2(lado1: Double, lado2: Double, lado3: Double){
    if (lado1 < lado2 + lado3 && lado2 < lado3 + lado1 && lado3 < lado1 + lado2){
        println("É possível formar um triangulo");
        if (lado1 == lado2 && lado1 == lado3){
            println("Equilátero")
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            println("Isósceles")
        }else{
            ("Escaleno")
        }

    }else{
        println("Não é possível formar um triangulo");
    }


}