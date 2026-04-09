import java.util.Scanner; //dispositivo de entrada teclado
import java.io.PrintStream; //dispositivo de saída de vídeo

public class App {
    public static void main(String[] args) throws Exception {
Scanner teclado = new Scanner(System.in); //system.in (entrada)viou teclado
PrintStream video = new PrintStream(System.out); //system.out (saída) virou video
String nome; //variavel pra caracteres

        video.println("Olá Dev! Vamos codar?"); //printLN imprime com quebra de linha
        video.print("Sem quebra de linha!"); //só o print imprime sem quebra de linha
        video.print("Bom dia! Todas aas manhãs são novas oportunidades"); //sem quebra
        video.println("Qual seu nome?");
        nome = teclado.next();

        video.println("Bem vindo, " + nome);

    }
}
