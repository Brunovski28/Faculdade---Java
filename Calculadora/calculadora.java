import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Número 1:");
        double num1 = entrada.nextDouble();

        System.out.println("Número 2:");
        double num2 = entrada.nextDouble();

        System.out.println(
                "Qual operação?\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Exponenciação\n6 - Fatorial");
        int operacao = entrada.nextInt();
        operacoes operacaoObjt = new operacoes();
        switch (operacao) {
            case 1:
                operacaoObjt = new adicao();
                break;

            case 2:
                operacaoObjt = new subtracao();
                break;

            case 3:
                operacaoObjt = new multiplicacao();
                break;

            case 4:
                operacaoObjt = new divisao();
                break;

            case 5:
                operacaoObjt = new exponenciacao();
                break;

            case 6:
                operacaoObjt = new fatorial();
                break;
            default:
                break;
        }

        resultado = operacaoObjt.calcular(num1, num2);

        System.out.println("resultado: " + resultado);

        entrada.close();

    }

}
