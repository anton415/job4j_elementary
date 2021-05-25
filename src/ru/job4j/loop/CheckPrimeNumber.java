package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean check = true;
        for (int i = number - 1; i > 1; i--) {
            if ((number % i) == 0) {
                check = false;
                break;
            }
        }
        if (number == 1 || number == 0) {
            check = false;
        }
        return check;
    }
}
