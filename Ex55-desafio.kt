package Exs1002

/*
Crie um jogo onde o computador vai sortear um númeroentre 1 e 5 o jogador vai tentar descobrir qual foi o valor
sorteado.
 */

fun main(){
    println("Adivinhe o número");
    print("Digite um valor de 1 até 10: ");
    jogadas();

}

fun jogadas(){

    val numeroAleatorio = (1..10).random();
    var numeroDeJogadas = 0;
    while (numeroDeJogadas < 4){
        var numeroEscolhido = readln().toInt();
        if (numeroEscolhido == numeroAleatorio){
            println("Acertou miseravi!");
            break;
        }else{
            println("Erroooou");
            println("Tente novamente!");
            numeroDeJogadas += 1;
        }
    }


}