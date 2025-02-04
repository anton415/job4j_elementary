package ru.job4j.condition;

/*
    1. Число делится и на 3 и на 2 - значит наш метод должен вернуть строку - "Исходное число делится на 6."
    2. Число делится на 3, но не является четным - в этом случае метод должен вернуть строку - "Исходное число делится на 3, но не является четным."
    3. Число не делится на 3, но является четным - результатом работы метода должна быть следующая строка - "Исходное число не делится на 3, но является четным."
    4. Число не делится на 3 и не является четным - метод возвращает строку - "Исходное число не делится на 3 и не является четным."
 */
public class DivideBySix {
    public static String checkNumber(int number) {
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                return "Исходное число делится на 6.";
            } else {
                return "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 == 0) {
                return "Исходное число не делится на 3, но является четным.";
            } else {
                return "Исходное число не делится на 3 и не является четным.";
            }
        }
    }
}
