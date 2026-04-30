import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jogo do pin!");

        int numero, mult;
        mult = 0; 
       
    
        System.out.println("Digite um número paa ser multiplicado");
        numero = teclado.nextInt();

        while (numero > 1 && numero <10){
            if (numero % mult == 0)
        System.out.println("PIN");
        else{
            System.out.println(numero);
        } 
        }
    }
}
