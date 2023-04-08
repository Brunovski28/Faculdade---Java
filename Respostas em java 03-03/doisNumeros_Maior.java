import java.util.Scanner;

public class doisNumeros_Maior {
    
    public static void main(String[] args) {
        
        Scanner mb = new Scanner(System.in);

        System.out.println("Digite o 1º número!");
        int num1 = mb.nextInt();

        System.out.println("Digite o 2º número!");
        int num2 = mb.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("1º número é maior que o 2º número");
        } else {
            System.out.println("2º número é maior que o 1º número");
        }

        mb.close();

    }

}
