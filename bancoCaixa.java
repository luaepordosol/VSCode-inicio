import java.util.Scanner;
import java.io.PrintStream;

public class bancoCaixa{
    private static Scanner teclado = new Scanner(System.in);
    private static double saque, depositar, total, retirado;

    public static void main(String[] args) throws Exception {
        menu();
        char op;
        do {
            op = menu();
        } while (op != 'd');
    }

    public static char menu(){
        char opcao;
        System.out.println("Caixa eletônico! O que deseja fazer hoje?");
        System.out.println("a. Depósito \n b. Ver saldo \n c. Efetuar saque \n d. Sair");
        opcao = teclado.next().charAt(0);
        switch (opcao){
            case 'a':
                deposito();
                break;
            case 'b':
                verSaldo();
                break;
            case 'c':
                saqueBB();
                break;
            default:
                System.out.println("* Obrigado e sigo à disposição! *");
                break;
            }
        return opcao;
        } 
    
    public static void deposito() {
        do {
        System.out.println("Quanto deseja depositar?");
        depositar = teclado.nextDouble();
        System.out.println("O valor do seu depósito foi de: " + depositar);
        total = depositar+total;
        System.out.println("Valor total: " + total);
        }  while (depositar != 0);
    }

    public static void verSaldo(){
        System.out.println("Seu Saldo é de: " + (retirado + depositar));
    }

    public static void saqueBB() {
        do {
        System.out.println("Qual valor deseja sacar? *Apenas valores entre 10 e 500*");
        saque = teclado.nextDouble();

        if (saque < 10) {
            System.out.println("Valor muito baixo, tente novamente!");
        } else if (saque > 500) {
            System.out.println("Valor muito alto, tente novamente!");
        } else if (saque % 10 != 0) {
            System.out.println("O valor tem que ser múltiplo de 10. Ex: 10, 20, 40.");
        } else if (saque > total) {
            System.out.println("Você não possui esse valor, seu total é de: R$"+ total);
        } else {
            System.out.println("O valor a ser sacado será de: " + saque);
        }
        } while (saque < 10 || saque > 500 || saque % 10 != 0 || saque >= total);
        retirado = total - saque;
        System.out.println("Seu Saldo é de: " + retirado);
    }
}
