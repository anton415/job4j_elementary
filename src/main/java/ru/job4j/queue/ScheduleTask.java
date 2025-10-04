package ru.job4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author antonserdyuchenko
 * @since 04.10.2025
 */
public class ScheduleTask {
    private PriorityQueue<Task> queue;

    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    /**
     * Добавляет переданную задачу в очередь.
     */
    public void addTask(Task task) {
        queue.offer(task);
    }

    /**
     * Читает элемент из головы очереди без удаления.
     */
    public Task readTask() {
        return queue.element();
    }

    /**
     * Возвращает задачу из головы очереди с удалением.
     */
    public Task getTask() {
        return queue.poll();
    }
}