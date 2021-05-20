package ru.job4j;
/*
   - создайте переменную с именем idea типа String и присвойте ей значение "I like Java!";
   - выведите на консоль эту переменную через команду System.out.println(idea);
   - присоедините к переменной idea строку "But I am a newbie.";
   - создайте переменную year с типом int и присвойте ей текущий год.
   - присоедините к переменной idea переменную year;
   - выведите на консоль эту переменную через команду System.out.println(idea);
 */
public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + "But I am a newbie.";
        int year = 2021;
        idea = idea + year;
        System.out.println(idea);
    }
}
