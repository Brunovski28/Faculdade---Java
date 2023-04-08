import java.util.Scanner;

public class quatroNumerosCrescente {
    
    public static void main(String[] args) {
        
        Scanner mb = new Scanner(System.in);

        int vetor[] = new int[4];

        System.out.println("Número 1º");
        vetor[0] = mb.nextInt();

        System.out.println("Número 2º");
        vetor[1] = mb.nextInt();

        System.out.println("Número 3º");
        vetor[2] = mb.nextInt();

        System.out.println("Número 4º");
        vetor[3] = mb.nextInt(); 
        
        num3Crescente(vetor);

        num4Crescente(vetor);

        mb.close();
    }


    public static void num4Crescente(int vetor[]){

        int maior = 0;
        int menor = 0;

        int numero2 = 0;
        int numero3 = 0;
        int numeroMaior = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > numeroMaior){
                numeroMaior = vetor[i];
                maior = i;
            }

            if(vetor[i] < numeroMenor){
                numeroMenor = vetor[i];
                menor = i;
            }

        }    

        int v_temp1 = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (i != maior && i != menor){
                v_temp1 = i;
                break;
            }
        }

        int v_temp2 = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (i != maior && i != menor && v_temp1 != i){
                v_temp2 = i;
            }
        }

        if (vetor[v_temp1] > vetor[v_temp2]) {
            numero3 = vetor[v_temp1];
            numero2 = vetor[v_temp2];
        } else {
            numero3 = vetor[v_temp2];
            numero2 = vetor[v_temp1];
        }

        System.out.println(numeroMenor+" "+ numero2 +" "+ numero3 +" "+numeroMaior);

    }
    

    public static void num3Crescente(int vetor[]){
        int maior = 0;
        int menor = 0;
        int numeroMaior = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            if(vetor[i] > numeroMaior){
                numeroMaior = vetor[i];
                maior = i;
            }

            if(vetor[i] < numeroMenor){
                numeroMenor = vetor[i];
                menor = i;
            }

        }    

        int v_temp1 = 0;

        for (int i = 0; i < 3; i++) {
            if (i != maior && i != menor){
                v_temp1 = i;
                break;
            }
        }

        System.out.println(numeroMenor+" "+ vetor[v_temp1] +" "+numeroMaior+" "+vetor[3]);

    }

}
