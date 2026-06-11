import java.util.Scanner;

public class tempMetodoi {
    public static Scanner teclado = new Scanner(System.in);
    public static int[] temperatura;
    public static String cidade;

    public static void main(String[] args) throws Exception {
        temperatura = new int[6];
        setTemperaturas(); //da temperaturas
        getTemperaturas();
    }
    
    public static void setTemperaturas(){
        int i; //variavel local para ler 6 twmperaturas
        System.out.println("Insira o nome da cidade");
        cidade = teclado.nextLine();
        System.out.println("Insira as últimas 6 temperaturas em °C");
        for (i=0; i<6; i++){
            temperatura[i] = teclado.nextInt();
        }
    }
    public static void getTemperaturas(){
        int i; 
        System.out.println("Cidade: " + cidade);


    }
    public static void getMedia(){
        int i, somaT, media;
        somaT = 0;
        for(i = 0; i < 6; i++){
            somaT = somaT + temperatura[i];
        }

    }
    
}
    
