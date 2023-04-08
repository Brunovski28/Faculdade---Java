import java.util.Scanner;

public class descontoDeUmProduto {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o preço do produto total?");
        double produto = entrada.nextDouble();

        System.out.println("Desconto de 10%: "+(produto*0.9));

        entrada.close();

    }

}
