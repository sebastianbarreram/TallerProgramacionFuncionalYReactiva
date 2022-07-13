package org.sofkau.retofinal.ejercicio3;

import java.util.function.Function;

public class DifferentiationAndIntegration {
    public static String Differentiation(Double constant, Integer exponent) {
        Function<Double, Double> multiply = a -> Double.valueOf(a * exponent);
        Double baseResult = multiply.apply(constant);
        Function<Integer, Integer> subtract = b -> b - 1;
        Integer exponentResult = subtract.apply(exponent);
        if (exponent != 1) {
            return "La derivada de la funcion " + constant + "x^" + exponent + " es " + baseResult + "x^" + exponentResult;
        }
        return "La derivada de la funcion " + constant + "x^" + exponent + " es " + baseResult;
    }

    public static String Integration(Double constant, Integer exponent) {
        Function<Double, Double> divition = a -> Double.valueOf(a / (exponent + 1));
        Double baseResult = divition.apply(constant);
        Function<Integer, Integer> addition = b -> b + 1;
        Integer exponentResult = addition.apply(exponent);
        if (exponent != -1) {
            return "La integral de la funcion " + constant + "x^" + exponent + " es " + baseResult + "x^" + exponentResult + " + C";
        }
        return "La integral de la funcion " + constant + "x^" + exponent + " es " + constant + "Ln(x) + C";
    }


    public static void main(String[] args) {
        System.out.println(Differentiation(2.0, 3));
        System.out.println(Differentiation(2.0, 1));
        System.out.println(Integration(6.0, -1));
        System.out.println(Integration(6.0, 2));
    }

}

