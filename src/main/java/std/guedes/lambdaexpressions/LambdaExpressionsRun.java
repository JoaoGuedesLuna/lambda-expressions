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
            public void println(double d) {
                out.println(d);
            }
        };
        system.println(math.sum(23.3, 48.9));
        ///////////////////////////////////////////


        //         USANDO LAMBDA PADRÃO          //
        math = (z, y) -> z + y;
        system = (d) -> out.println(d);
        system.println(math.sum(23.3, 48.9));
        ///////////////////////////////////////////


        // USANDO LAMBDA COM REFERÊNCIA A MÉTODO //
        math = Double::sum;
        system = out::println;
        system.println(math.sum(23.3, 48.9));
        ///////////////////////////////////////////
    }

}