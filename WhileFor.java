public class WhileFor {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int valor;

        System.out.println("For");

        for (valor = 1; valor <= 20; valor++) {
            System.out.println(valor);
        }

        System.out.println("While");
        valor = 1; //inicializa variavel
        while (valor <=20) {
            System.out.println(valor);
            valor = valor + 1;
        } 
    }
}
