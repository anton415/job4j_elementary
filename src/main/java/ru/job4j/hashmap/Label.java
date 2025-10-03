package ru.job4j.hashmap;

/**
 * Класс Label содержит результаты: имя и баллы.
 * Этот класс используется как для учеников, так и для предметов.
 * @param name      имя.
 * @param score     баллы.
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}
