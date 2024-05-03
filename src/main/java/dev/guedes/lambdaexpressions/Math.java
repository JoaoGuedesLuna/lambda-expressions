package main.java.dev.guedes.lambdaexpressions;

/**
 * Functional interface.
 *
 * @author João Guedes
 */
@FunctionalInterface
public interface Math {

    /**
     * Returns the sum of two values.
     *
     * @param x First number
     *
     * @param y Second number
     *
     * @return Returns the sum of two values.
     */
    double sum(double x, double y);

}
