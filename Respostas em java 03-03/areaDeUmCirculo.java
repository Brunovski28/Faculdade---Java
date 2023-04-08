import java.util.Scanner;

public class areaDeUmCirculo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o raio do circulo?");
        double circulo = entrada.nextDouble();


        System.out.println("Área do circulo é: "+(circulo*Math.PI));

        entrada.close();

    }
    
}
