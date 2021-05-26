package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean temp = data[0];
        for (boolean element : data) {
            if (temp != element) {
                return false;
            }
        }
        return true;
    }
}
