import java.io.PrintStream;
import java.util.Scanner;

public class JuroComposto {
    private static Scanner teclado = new Scanner(System.in);
    private static PrintStream video = new PrintStream(System.out);
    private static String aplicacao;  //rbd, cripto, cdb, fundos
    private static double meses;      //prazo de aplicacao
    private static double juros;      //rendimento mensal
    private static double capital;    //valor inicial 
    private static double montante;   //quanto rendeu no prazo
    private static double inserir; 


public static void main(String[] args) {
   video.println("Programa de rendimentos!");
   //entradas
   aplicacao = escolherAplicacao();
   video.println("Você escolheu: " + aplicacao);
   setValoresRendimento();
   //lógica aritmética
   //getMontanteMensal();
   //saída
   video.println("Obrigado por escolher o banco Quadrado");
}


public static void setValoresRendimento(){ //apital, meses, juros
    video.println("Qual o capital inicial?");
    capital = teclado.nextDouble();
    video.println("Qual o número de meses?");
    meses =  teclado.nextDouble();
    video.println("Qual o juros?");
    juros = teclado.nextDouble();
}

/* 
public static void getMontanteMensal(){
    int mesAmes;
    double resultado = capital;
        for(mesAmes = 1; mesAmes<=meses; mesAmes=mesAmes+1){
            resultado = resultado + (resultado*(juros/100));
            video.print("Montante Mes " + mesAmes);
            video.printf(": R$ %.2f \n",resultado);

        }
}
*/

public static String escolherAplicacao(){  
    String minhaAplicacao;
    video.println("Qual aplicacao deseja?");
    video.println("a. CDB\n b. RDB\n c. Cripto\n d. Fundos \n e. Poupança \n f. Sair");
    video.println("Informe sua opção: ");
    switch (teclado.next().charAt(0)){
        case 'a': minhaAplicacao = "CDB";
        opCDB();    // 1.2/100 ao mes
            break;
        case 'b': minhaAplicacao = "RDB";    // 0.83/100  ao mes
            break;
        case 'c': minhaAplicacao = "CRIPTO"; // random 2/100 e 8/100 ao mes
            break;
        case 'd': minhaAplicacao = "FUNDOS";  // 0.70/100 ao mes
        //inserir poupança e atuliazar default para digitação do usuario
        // rodar mais d uma vez ate usuario desejar sair
        case 'e': minhaAplicacao = "Poupança"; //0.5/10 ao mes
            break;
        default: minhaAplicacao = "Sair";
        }
    return minhaAplicacao;
    }
    public static void opCDB(){
            video.println("lala");
            juros = 1.2/100;
    }
}