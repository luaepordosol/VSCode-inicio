import java.util.Scanner;

public class stringEx2 {
    public static Scanner teclado;
    public static String palavraS; //palavra em string
    public static char[] palavraV; //palavra em vetor

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Informe sua palavra mágica");
        palavraS = teclado.next();

        //convertendo de string para vetor de char:
        palavraV = palavraS.toCharArray();

        System.out.println(palavraV);
        System.out.println("Primeira letra da palavra: " + palavraV[0]); //palavraS.charAt(0) & primeira letra
        System.out.println("Tamanho da palavra");
        System.out.println(palavraV.length); //mostra o tamanhoda palavra em int 
        int u;
        int i;
        u = palavraV.length - 1;
        System.out.println("Última letra: " + palavraV[u]); 
        System.out.println("Palavra ao contrário: ");
        for (i = u; i>=0; i--){
            System.out.println(palavraV[i]);
        }
        //palavra ao contrario com for


    }
}
