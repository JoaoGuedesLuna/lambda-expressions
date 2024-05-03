package main.java.dev.guedes.lambdaexpressions;

/**
 * Class that initializes the application.
 *
 * @author João Guedes
 */
public class LambdaExpressionsApplication {

    public static void main(String[] args) {
        Math math;
        double n1 = 23.3, n2 = 48.9;

        math = new Math() {
            @Override
            public double sum(double x, double y) {
                return x + y;
            }
        };
        System.out.printf("Result without lambda: %.2f%n", math.sum(n1, n2));

        math = (z, y) -> z + y;
        System.out.printf("Result with standard lambda: %.2f%n", math.sum(n1, n2));

        math = Double::sum;
        System.out.printf("Result with lambda with method reference: %.2f%n", math.sum(n1, n2));
    }

}
