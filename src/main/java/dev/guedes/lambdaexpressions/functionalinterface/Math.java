package main.java.dev.guedes.lambdaexpressions.functionalinterface;

/**
 * Functional interface representing a mathematical operation.
 * The interface declares a method to sum two double values.
 * It is annotated with @FunctionalInterface to ensure that it follows the constraints
 * of a functional interface (only one abstract method).
 *
 * @author João Guedes
 */
@FunctionalInterface
public interface Math {

    /**
     * Method to calculate the sum of two double values.
     *
     * @param x The first value to be summed.
     *
     * @param y The second value to be summed.
     *
     * @return The sum of x and y.
     */
    double sum(double x, double y);

}
