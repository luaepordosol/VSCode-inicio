import java.util.Scanner;

public class getDiscente {
    static Scanner teclado;
    static Aluno discente;

    public static void main(String[] args) throws Exception {
        System.out.println("Cadastro de alunos!");
        teclado = new Scanner(System.in);
        discente = new Aluno();
        System.out.println("Informe Nome, Turma, Idade, Média, Conceito e Tipo sanguíneo do Discente:");
        discente.nome = teclado.next();
        discente.turma = teclado.next();
        discente.idade = teclado.nextInt();
        discente.media = teclado.nextDouble();
        discente.conceito = teclado.next().charAt(0);
        discente.sanguineo = teclado.next();
        System.out.println("Nome: " + discente.nome);
        System.out.println("Turma: " + discente.turma);
        System.out.println("Idade: " + discente.idade);
        System.out.println("Media: " + discente.media);
        System.out.println("Conceito: " + discente.conceito);
        System.out.println("Tipo sanguíneo: " + discente.sanguineo);
    }
}