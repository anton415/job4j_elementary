package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 178;
        double man = Fit.manWeight(height);
        System.out.println("Man 178 is " + man);
    }
}
