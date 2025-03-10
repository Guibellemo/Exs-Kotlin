package Exs1002

/*
Crie um jogo onde o computador vai sortear um númeroentre 1 e 5 o jogador vai tentar descobrir qual foi o valor
sorteado.
 */

fun main(){
    println("Adivinhe o número");
    print("Digite um valor de 1 até 5: ");
    var numeroEscolhido = readln().toInt();
    jogada(numeroEscolhido)
}

fun jogada(numeroEscolhido: Int){
    val numeroAleatorio = (1..5).random();
    if (numeroEscolhido == numeroAleatorio){
        println("Acertou miseravi!");
    }else{
        println("Erroooou");
    }

}