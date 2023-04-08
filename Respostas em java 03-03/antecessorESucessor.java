import java.util.Scanner;

public class antecessorESucessor {
    
    public static void main(String[] args) {
        
        Scanner mb = new Scanner(System.in);

        System.out.println("Número?");
        int num = mb.nextInt();

        System.out.println((num-1)+" "+ num + " " + (num+1));

        mb.close();

    }

}
