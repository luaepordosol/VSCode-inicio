import java.util.Scanner;

public class temperatura {
    public static Scanner teclado = new Scanner(System.in);
    public static double[] temperatura;
    public static double media;
    public static String cidade;

    public static void main(String[] args) throws Exception {
        lerTemperaturas();
    }
    
    public static void lerTemperaturas(){
        int i; //variavel local para ler 6 twmperaturas
        System.out.println("Insira o nome da cidade");
        cidade = teclado.nextLine();
        System.out.println("Insira 6 temperaturas");
        temperatura = new double [6];
        temperatura[0] = teclado.nextDouble();
        temperatura[1] = teclado.nextDouble();
        temperatura[2] = teclado.nextDouble();
        temperatura[3] = teclado.nextDouble();
        temperatura[4] = teclado.nextDouble();
        temperatura[5] = teclado.nextDouble();
        System.out.println(cidade);
        media = (temperatura [0] + temperatura [1] +temperatura [2] +temperatura [3] +temperatura [4] + temperatura [5])/6;
        System.out.println("A média de temperatura desde a última semana é de: " + media);
        System.out.println("As temperaturas registradas foram de: " + temperatura [0] + temperatura [1] + 
        temperatura [2] + temperatura [3] + temperatura [4] + temperatura [5]);
        System.out.println("A maior temperatura registrada foi de: " + );
    }
    
}
