import java.util.Scanner;

public class areaDeUmTriangulo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a base do triângulo");
        double base = entrada.nextDouble();

        System.out.println("Qual a altura do triângulo?");
        double altura = entrada.nextDouble();

        System.out.println("Área do triângulo é: "+((base*altura)/2));

        entrada.close();

    }
    
}
