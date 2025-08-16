package ru.job4j;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        String name = "Anton Serdyuchenko";
        int age = 27;

        ArgMethod.hello(name, age);
    }
}
