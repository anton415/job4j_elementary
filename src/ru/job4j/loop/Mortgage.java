package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100 + 1;
        while (amount > 0) {
            amount *= percent;
            amount -= salary;
            year++;
        }
        return year;
    }
}
