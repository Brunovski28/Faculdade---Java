import java.util.Scanner;

public class realEaCotacaoDolar {
    
    public static void main(String[] args) {
        
        Scanner mb = new Scanner(System.in);

        System.out.println("Quantos reais?");
        double real = mb.nextDouble();

        System.out.println("Cotação do dolar?");
        double cotacao = mb.nextDouble();

        System.out.println("Dólar: "+real/cotacao);

        mb.close();

    }

}
