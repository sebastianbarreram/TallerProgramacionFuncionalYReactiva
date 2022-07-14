package org.sofkau.retofinal.ejercicio3;

import java.util.function.Function;

/**
 * Esta clase es la solución al ejercicio 3
 */
public class DifferentiationAndIntegration {
    /**
     * Esta funcion resuelve la derivada de una funcion de la forma cx^n
     * donde c es una constante y n es un numero entero
     *
     * @param constant constante que multiplica a la funcion
     * @param exponent exponente entero de la funcion
     * @return string con el resultado de la derivada
     */
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

    /**
     * Esta funcion resuelve la integral de una funcion de la forma cx^n
     * donde c es una constante y n es un numero entero
     *
     * @param constant constante que multiplica a la funcion
     * @param exponent exponente entero de la funcion
     * @return string con el resultado de la integral
     */
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

