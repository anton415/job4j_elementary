package ru.job4j.queue;

import java.util.Comparator;

/**
 * Сортирует по полю position по возрастанию.
 * @author antonserdyuchenko
 * @since 04.10.2025
 */
public class TaskByPositionAsc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.position().compareTo(o2.position());
    }
}