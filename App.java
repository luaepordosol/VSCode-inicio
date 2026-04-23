import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double b1, b2, b3, b4, nf;
        String seraquedeuboa; 
        System.out.println("Informe as 4 notas bimestrais 1b 2b 3b 4b :");
        b1 = teclado.nextDouble();
        b2 = teclado.nextDouble();
        b3 = teclado.nextDouble();
        b4 = teclado.nextDouble();

        nf = (b1+b2+b3+b4)/4;
        seraquedeuboa = "Reprovado";

        if(nf >= 6.0){
            seraquedeuboa = "Aprovado";

        } 
        else if (nf >=4 & nf < 5.9){
            seraquedeuboa = "Recuperação!";
        } 
        else{
            seraquedeuboa = "Reprovado!";
        }


        System.out.println("Sua média final foi de: " + nf );
        System.out.println(seraquedeuboa);

    }
}
