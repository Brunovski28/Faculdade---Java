import java.util.Scanner;

public class CelsiusParaFahrenheit {
    
    public static void main(String[] args) {
        
            Scanner mb = new Scanner(System.in);

        System.out.println("Celsius? ");
        double num1 = mb.nextInt();
        System.out.println("Fahrenheit: " + (9 * num1 + 160) / 5 + "°F");

        mb.close();

    }

}
