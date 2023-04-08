import java.util.Scanner;

public class somaTresNumeros {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int total = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o "+(i+1)+"° número!");
            int numero = entrada.nextInt();

            total += numero;
        }
        System.out.println("Total da soma deu "+total);

        entrada.close();

    }

}
