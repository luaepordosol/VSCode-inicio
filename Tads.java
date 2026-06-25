import java.util.Scanner;
public class Tads {
    static Scanner teclado;
    static Aluno turma[];

    public static void main(String[] args) {
        System.out.println("Criando 3 alunos: ");
        teclado = new Scanner(System.in);
        turma = new Aluno[30];//turma com 30 alunos

        setTurma(4);

    }

    public static void setTurma(int n){
    int i;
        for(i=1; i<n; i++){
            turma[i] = new Aluno();
        System.out.println("Informe nome e conceito do aluno: " + i);
        turma[i].nome = teclado.next();
        turma[i].conceito = teclado.next().charAt(0);
        }
    }
    public static void getTurma(){
        
    }
}
