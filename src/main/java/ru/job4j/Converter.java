package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        // Euro
        int inE = 140;
        int expectedE = 2;
        int outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        System.out.println("140 rubles are 2. Test result : " + passedE);

        // Dollar
        int inD = 180;
        int expectedD = 3;
        int outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("180 rubles are 3. Test result : " + passedD);
    }
}
