package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + allFourOperation(10, 20));
    }

    // будет считать сумму двух операций из класса MathFunction: разность двух чисел и деление двух чисел.
    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    // будет рассчитывать сумму вычисления всех четырех операций из класса MathFunction.
    public static double allFourOperation(double first, double second) {
        return subtraction(first, second)
                + division(first, second)
                + sum(first, second)
                + multiply(first, second);
    }
}