package main.java.std.guedes.lambdaexpressions;

import main.java.std.guedes.lambdaexpressions.functionalinterfaces._Math;
import main.java.std.guedes.lambdaexpressions.functionalinterfaces._System;
import static java.lang.System.out;

public class LambdaExpressionsRun {

    private static _Math math;
    private static _System system;

    public static void main(String[] args) {
        //          SEM USAR LAMBDA              //
        math = new _Math() {
            @Override
            public double sum(double x, double y) {
                return x + y;
            }
        };
        system = new _System() {
            @Override
            public void print() {
                out.println(math.sum(23.3, 48.9));
            }
        };
        system.print();
        ////////////////////////////////////////////


        //           USANDO LAMBDA               //
        math = (z, y) -> z + y;
        system = () -> out.println(math.sum(23.3, 48.9));
        system.print();
        ////////////////////////////////////////////
    }

}