import java.util.Scanner;

public class pesoIdeal_AlturaSexo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu sexo? M ou F");
        char sexo = entrada.next().charAt(0);

        if (sexo == 'f' || sexo == 'F'){
            System.out.println("Seu peso ideal é: "+((altura*62.1)-44.7)+" kg's");
        } else if (sexo == 'M' || sexo == 'm'){
            System.out.println("Seu peso ideal é: "+((altura*72.7)-58)+" kg's");
        } else {
            System.out.println("Sexo errado!");
        }

        entrada.close();

    }

}