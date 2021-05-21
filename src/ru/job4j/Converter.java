package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(100);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("100 rubles are " + dollar + " dollar.");
    }
}
