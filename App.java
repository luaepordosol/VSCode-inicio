import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de váriaveis:
        int anoNasc, idade, aposenta; //variável do ano de nascimento - mumero intero
        double renda, novaRenda; //variável de rend - numero real
        boolean dev; // variável lógica se vc é programador: true ou false
        String nome; // pergunta o nome do programador
        char genero; //define o genero da pessoa em uma letra só
        Scanner teclado = new Scanner(System.in); //instalar entrada
        PrintStream video = new PrintStream(System.out);

        //entrada das váriaveis:
        video.println("Calculadora de idade!");
        video.println("Qual seu nome?");
        nome = teclado.next(); //faz leitura da string nome
        video.println("Você é programador?");
        dev = teclado.nextBoolean(); 
        video.println("Qual seu genero? (letra)");
        genero = teclado.next().charAt(0); //forma adequada de ler um caractere
        video.println("Qual sua renda mensal?");
        renda = teclado.nextDouble();
        video.println("Em que ano nasceu?");
        anoNasc = teclado.nextInt();

        //procedimentos lógicos e aritméticos:
        idade = 2026 - anoNasc; //diz idade completa esse ano
        renda = renda*12;//renda anual total básica com déimo teceiro:
        if(genero=='m'){ //teste para ver daqui quanto tempo aposenta
            aposenta=70-idade; //daqui quanto tempo aposenta se masc
        }
        else {
         aposenta=65 - idade;
        }

        if(dev){
            novaRenda=renda*3/13;
        } else novaRenda=renda/13;

        //procedimentos de saída
        video.println(nome + " este ano completa " + idade + " anos. ");
        video.print("Sua renda anual é de R$" + renda);
        video.println("Faltam " + aposenta + " anos para se aposentar! ");
        video.println("DEV seria com renda mensal de R$" + novaRenda);
        video.println("Se fosse DEV para gringa o sálario é de R$" + novaRenda*5);
    }
}
