package ru.job4j.hashmap;

/**
 * Класс Subject описывает школьный предмет и аттестационный балл ученика.
 * @param name      школьный предмет.
 * @param score     аттестационный балл ученика.
 */
public record Subject(String name, int score) {
}
