public class exponenciacao extends operacoes {

    public double calcular(double num1, double num2) {

        double resultado = 0;

        if (num2 != 0) {

            for (int i = 0; i < num2 - 1; i++) {
                if (i == 0) {
                    resultado = num1 * num1;
                } else {

                    resultado = resultado * num1;

                }

            }

        } else {
            resultado = 1;
        }

        return resultado;
    }

}
