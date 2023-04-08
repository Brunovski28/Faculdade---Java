import java.util.Scanner;

public class numeroPositivo_variosNumeros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual número positivo?");
        int numPositivo = entrada.nextInt();


        System.out.println("Ao quadrado: "+(numPositivo*numPositivo));
        System.out.println("Ao cubo: "+(numPositivo*numPositivo*numPositivo));

        int contador = 1;
        while (true) {
            contador++;
            if (numPositivo % contador == 0){
                System.out.println("Raiz quadrada: "+contador);
                break;
            } 

            entrada.close();

        }
        
    }
    
}
