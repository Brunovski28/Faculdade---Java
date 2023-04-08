import java.util.Scanner;

public class tresNotas_mediaAritmetica {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int total = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a "+(i+1)+"° nota!");
            int numero = entrada.nextInt();

            total += numero;
        }
        System.out.println("A média aritmetica é: "+total/3);

        entrada.close();

    }

}
