package Exs1002
import java.util.Calendar

/*
• Escreva um programa que leia o ano de nascimento de um rapaze
mostre a sua situação em relação ao alistamento militar.
• Se estiver antes dos 18 anos, mostre em quantos anos
faltam para o alistamento.
• Se já tiver depois dos 18 anos, mostre quantos anos já
se passaram do alistamento.
 */

fun main(){
    val calendario = Calendar.getInstance();
    val anoAtual = calendario.get(Calendar.YEAR);
    print("Digite o seu ano de nascimento: ");
    var anoNascimento = readln().toInt();
    Alistamento(anoAtual, anoNascimento);
}

fun Alistamento(anoAtual: Int, anoNascimento: Int){
    if (anoAtual - anoNascimento < 18){
        var anosFaltantes = 18 - (anoAtual - anoNascimento);
        println("Faltam " + anosFaltantes + " anos");
    }else{
        var anosPassados = anoAtual - (anoNascimento + 18);
        println("Já se passaram " + anosPassados + " anos");
    }
}