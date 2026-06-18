import java.util.Scanner;

public class jogodavelha {
    public static char velha[][];
    public static Scanner teclado;
    public static int jogadas;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        velha = new char [3][3];

        char Player = 'X'; //primeiro a jpgar é o X
        zerarVelha();
        for (jogadas=1; jogadas<=9; jogadas++){
        imprimeVelha();
        jogar(Player);
        Player = (Player=='X')? 'O': 'X'; //qualificador ternario
        }
        System.out.println("Game over!!");
        imprimeVelha();
    }

    public static void jogar(char Player){
        int l,c;
        boolean repetir = true;
    do{
        System.out.printf("\n\nJogador %c informe Linha e Coluna: \n", Player);
        l = teclado.nextInt();
        c = teclado.nextInt();
        if(l<3 && c<3){
            if (velha [l][c]== '.'){
                velha [l][c] = Player;
             repetir = false;
            }
            else System.out.println("Jogada inválida, tente novamente...");
        }
            else System.out.println("Jogada inválida (0 ou 1) tente novamente...");
    }while(repetir);
    }

    public static void zerarVelha(){
        int l,c;
        for(l=0; l<3; l++){
            for(c=0; c<3; c++){
            velha[l][c] = '.';
            }
        }
    }
    public static void imprimeVelha(){
        int l,c;
        for(l=0; l<3; l++){
            System.out.println("  ");
            for(c=0; c<3; c++){
                System.out.print(" " + velha[l][c]);
            }
        }
    }
}
    //chek linha/coluna/transversal

