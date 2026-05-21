import java.util.Scanner;
public class idoso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BemVindo();
        menuEscolha();
    
    }

public static void menuEscolha(){
    Scanner teclado = new Scanner(System.in);
    char op;
    System.out.println("a. Direito a entrada de ônibus \n" + 
                     "b. Direito a meia ingresso \n" + 
                     "c. Prestação do consignado do idoso \n");
    System.out.println("Digite o que deseja saber: ");
    op = teclado.next().charAt(0);
}


public static void BemVindo(){
        System.out.println("╔══════════════════════════╗");
        System.out.println("║                          ║");
        System.out.println("║        BEM VINDO!        ║");
        System.out.println("║                          ║");
        System.out.println("╚══════════════════════════╝");
    }

public static void VerificaBus(){

}
 
}
