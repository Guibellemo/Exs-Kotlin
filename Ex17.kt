package Exs1002

/*
Escreva um programa que pergunte a velocidade de um carro.
Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
cada Km acima da velocidade permitida.
 */

fun main(){
    print("Digita a velocidade na via: ");
    var velocidade = readln().toDouble();
    multa(velocidade);

}

fun multa(velocidade : Double){
    if (velocidade > 80){
        println("Você foi multado.");
        var aPagar = (velocidade - 80) * 5.toDouble();
        println("Valor da multa é: R$$aPagar");
    }
}