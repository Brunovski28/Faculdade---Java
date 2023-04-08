import java.util.Scanner;

public class verificacaoNumImpar {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite algum número");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        entrada.close();

    }

}
