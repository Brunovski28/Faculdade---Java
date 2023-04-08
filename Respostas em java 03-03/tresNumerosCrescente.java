import java.util.Scanner;

public class tresNumerosCrescente {
    
    public static void main(String[] args) {
        
        Scanner mb = new Scanner(System.in);

        int vetor[] = new int[3];

        int maior = 0;
        int menor = 0;

        int numeroMaior = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        System.out.println("Número 1º");
        vetor[0] = mb.nextInt();

        System.out.println("Número 2º");
        vetor[1] = mb.nextInt();

        System.out.println("Número 3º");
        vetor[2] = mb.nextInt();
  

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
        int teste = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i != maior && i != menor){
                teste = vetor[i];
            }
        }

        System.out.println("Maior número "+numeroMaior+"\n"+
                           "Númmero do meio "+teste+"\n"+
                           "Menor número "+numeroMenor);

                           System.out.println(numeroMenor+" "+teste+" "+numeroMaior);

        mb.close();
    }

}
