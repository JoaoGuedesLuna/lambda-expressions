package main.java.dev.guedes.lambdaexpressions;

/**
 * @author João Guedes
 */
public class LambdaExpressionsApplication {

    private static Math math;

    public static void main(String[] args) {
        //          SEM USAR LAMBDA              //
        math = new Math() {
            @Override
            public double sum(double x, double y) {
                return x + y;
            }
        };
        math.sum(23.3, 48.9);
        ///////////////////////////////////////////


        //         USANDO LAMBDA PADRÃO          //
        math = (z, y) -> z + y;
        math.sum(23.3, 48.9);
        ///////////////////////////////////////////


        // USANDO LAMBDA COM REFERÊNCIA A MÉTODO //
        math = Double::sum;
        math.sum(23.3, 48.9);
        ///////////////////////////////////////////
    }

}