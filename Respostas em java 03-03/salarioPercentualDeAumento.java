import java.util.Scanner;

public class salarioPercentualDeAumento {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Salário do funcionário:");
        double salario = entrada.nextDouble();

        System.out.println("Percentual de aumento:");
        double percentual = entrada.nextDouble();

        double salarioTotal = salario*(1.00+(percentual/100));

        System.out.println("Salário com aumento: "+salarioTotal);

        entrada.close();        

    }
    
}