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

        switch (operacao) {
            case 1:
                operacoes operacaoObjC = new adicao();
                resultado = operacaoObjC.calcular(num1, num2);
                break;

            case 2:
                operacoes operacaoObjS = new subtracao();
                resultado = operacaoObjS.calcular(num1, num2);
                break;

            case 3:
                operacoes operacaoObjM = new multiplicacao();
                resultado = operacaoObjM.calcular(num1, num2);
                break;

            case 4:
                operacoes operacaoObjD = new divisao();
                resultado = operacaoObjD.calcular(num1, num2);
                break;

            case 5:
                operacoes operacaoObjE = new exponenciacao();
                resultado = operacaoObjE.calcular(num1, num2);
                break;

            case 6:
                operacoes operacaoObjF = new fatorial();
                resultado = operacaoObjF.calcular(num1, num2);
                break;
            default:
                break;
        }

        System.out.println("resultado: " + resultado);

        entrada.close();

    }

}
