import java.util.Scanner;

public class salarioComGratificacaoEImposto {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Salário-base do funcionário:");
        double salario = entrada.nextDouble();

        double imposto = salario * 0.07;
        double gratificacao = salario * 0.05;
        
        System.out.println("Vai pagar "+imposto+" de imposto");
        System.out.println("receberá "+gratificacao+" de gratificação");
        System.out.println("Salário limpo "+(salario+gratificacao-imposto));

        entrada.close();

    }
    
}