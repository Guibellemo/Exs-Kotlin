package Exs1002

fun main(){
    println("[1] Pedra");
    println("[2] Papel");
    println("[3] Tesoura");
    print("Jogador 1 faça sua escolha: ");
    var jogador1 = readln().toString();
    print("Jogador 2 faça sua escolha: ");
    var jogador2 = readln().toString();
    jokenpo(jogador1, jogador2);

}

fun jokenpo(jogador1: String, jogador2: String){
    if (jogador1 == "1" && jogador2 == "3" || jogador1 == "2" && jogador2 == "1" || jogador1 == "3" && jogador2 == "1"){
        println("Jogador 1 venceu");
    } else if (jogador2 == "1" && jogador1 == "3" || jogador2 == "2" && jogador1 == "1" || jogador2 == "3" && jogador1 == "1"){
        println("Jogador 2 venceu");
    }else{
        println("Empate");
    }

}