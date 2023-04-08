public class fatorial extends operacoes {
    
    public double calcular(double num1, double num2){

        double resultado = 0;

        for (int i = 0; i < num2; i++) {
            
            if (i == 0) {
                resultado = num1 * (i+1);
            } else {
                resultado = resultado * (i+1);
            }

        }
        
        return resultado;
    }

}
