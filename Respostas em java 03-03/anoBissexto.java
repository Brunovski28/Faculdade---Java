import java.util.Scanner;

public class anoBissexto {
    
    public static void main(String[] args) {
        
        Scanner mb = new Scanner(System.in);

        System.out.println("Ano");
        int ano = mb.nextInt();

        if (ano % 4 == 0){
            System.out.println("É um ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        mb.close();

    }

}
