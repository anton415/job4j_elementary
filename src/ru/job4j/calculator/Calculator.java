package ru.job4j.calculator;
/*
1. В методе main создайте дополнительные переменные, кроме тех, что уже созданы.
 - переменную типа int c именем six и значением 6.
 - переменную типа int c именем four и значением 4.
 - переменную типа int с именем five и значением 5.

2. Создайте еще три переменные для хранения результата арифметических операций.
  - переменную типа int c именем sixDivTwo и присвойте ей значение арифметической операции деления переменной six на two.
  - переменную типа int c именем fiveMinusTwo и присвойте ей значение арифметической операции вычитания переменной five c two.
  - переменную типа int c именем fourTimeTwo и присвойте ей значение арифметической операции умножения переменной four на two.

3. Выведите на консоль переменные sixDivTwo, fiveMinusTwo, fourTimeTwo.
 */
public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }
}
