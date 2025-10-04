package ru.job4j.queue;

import java.util.Comparator;

/**
 * Сортирует по полю urgency в обратном порядке, т.е. чем больше число, тем ближе к началу оно должно находиться.
 * @author antonserdyuchenko
 * @since 04.10.2025
 */
public class TaskByUrgencyDesc implements Comparator<Task> {
 @Override
 public int compare(Task o1, Task o2) {
  return Integer.compare(o2.urgency(), o1.urgency());
 }
}
