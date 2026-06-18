import java.util.Scanner;
public class funcionario { //fazer pulando linha e nao coluna
    public static Scanner teclado;
    public static int [][]funcionario;

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        funcionario = new int[3][2];
        setDados(); //pega informações
        getDados(); //mostra infos
    }

    public static void setDados(){
        int i;
        for (i=0; i<3; i++){
            System.out.println("Informe a idade e o salário do funcionário: " + (i+1)+":");
            funcionario[i][0] = teclado.nextInt();
            funcionario[i][1] = teclado.nextInt();
        }
    }
    
    public static void getDados(){
        int i;
        for (i=0; i<3; i++){
            System.out.println(
                "Funcionario " + (i+1) +
                ": " +
                funcionario[i][0] +
                " anos de idade com salário de R$" +
                funcionario[i][1]
            );
        }
    }
}

