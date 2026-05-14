import java.util.Random;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        /* Declaração de objetos e variáveis */
        Scanner teclado = new Scanner(System.in);
        Random gerar = new Random();
        int sorteio, pont1, pont2, empate;
        char p1, p2, jogar; // player1 e player2
        String Player2 = "jkp";

        pont1 = 0;
        pont2 = 0;

        /* Entradas */
        do {
            System.out.println("*Jo Ken Po*");
            System.out.println("Escolha:");
            System.out.println(" j-Pedra; \n k-Papel\n p-Tesoura \n Player1: ");
            p1 = teclado.next().charAt(0); // ler o primeiro caracter player1

            sorteio = gerar.nextInt(3); // sorteia entre 0, 1 ou 2
            p2 = Player2.charAt(sorteio); // ler o caracter sorteado para o player2
            System.out.println(" Gepeto jogou " + p2);

            /* Lógica e-ou Aritmética */
            switch (p1) {
                case 'j':
                    System.out.print("Vc escolheu pedra, ");
                    // utilizando if-else
                    if (p2 == 'j') {
                        System.out.println("Gepeto escolheu pedra, deu empate!");
                        empate = 0;
                    } else if (p2 == 'k') {
                        System.out.println("Gepeto escolheu papel, IA venceu!");
                        pont2++;
                    } else if (p2 == 'p') {
                        System.out.println("Gepeto escolheu tesoura, vc venceu!");
                        pont1++;
                    }
                    break;
                case 'k':
                    System.out.print("Vc escolheu papel, ");
                    // utilizando switch-case
                    switch (p2) {
                        case 'j':
                            System.out.println("Gepeto jogou pedra, vc venceu!");
                            pont1++;
                            break;
                        case 'p':
                            System.out.println("Gepeto jogou tesoura, IA venceu!");
                            pont2++;
                            break;
                        default:
                            System.out.println("Gepeto jogou papel, deu empate!");
                            empate = 0;
                    }
                    break;
                case 'p':
                    System.out.print("Vc escolheu tesoura, ");
                    switch (p2) {
                        case 'j':
                            System.out.println("Gepeto jogou pedra, IA venceu!");
                            pont2++;
                            break;
                        case 'k':
                            System.out.println("Gepeto jogou papel, vc venceu!");
                            pont1++;
                            break;
                        default:
                            System.out.println("Gepeto jogou tesoura, empate!");
                            empate = 0;
                    }
            }
            System.out.println("Deseja jogar novamente?");
            jogar = teclado.next().charAt(0);

        } while (jogar == 's');

        if (pont1 > pont2) {
            System.out.println("Parabéns, vc venceu o jogo!");
            System.out.println("A pontuação foi de: ");
            System.out.println("Vc = " + pont1);
            System.out.println("IA = " + pont2);
        }
        if (pont1 < pont2) {
            System.out.println("Fuen fuen fuen fuen... Vc perdeu o jogo!");
            System.out.println("A pontuação foi de: ");
            System.out.println("Vc = " + pont1);
            System.out.println("IA = " + pont2);
        }
        if (pont1 == pont2) {
            System.out.println("Eita! Deu empate");
            System.out.println("A pontuação foi de: ");
            System.out.println("Vc = " + pont1);
            System.out.println("IA = " + pont2);
        }
        if (pont1 == 0 && pont2 == 0) {
            System.out.println("Não há ganhadores!");
            System.out.println("A pontuação foi de: ");
            System.out.println("Vc = " + pont1);
            System.out.println("IA = " + pont2);
        }

    }
}
