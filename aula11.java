import javax.print.attribute.standard.Media;

public class aula11 {
    public static double[] nota;

    public static void main(String[] args) throws Exception {
        nota = new double [100]; //aloca a memória para 100 doubles
        nota[0] = 8.0;
        nota[1] = 7.5;
        nota[2] = 10.0;
        nota[3] = 6.0;
        //System.out.println(nota);

        nota[4] = (nota[0] + nota[1] + nota[2] + nota[3])/4; //media
        System.out.println(nota[4]);
        //System.out.printf("%f; %.2f; %.1f", nota[0], nota[1], nota[2], nota[3]);
        for (int i=0; i<nota.length; i++){
            System.out.print(""+ nota[i]);
        }
        /*for (int i=0; i<=99; i++){
            System.out.println(nota[i]);
        } */
        


    }
}
