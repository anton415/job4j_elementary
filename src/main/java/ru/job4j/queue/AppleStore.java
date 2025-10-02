package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    /**
     * Очередь клиентов, которые пришли в магазин.
     */
    private final Queue<Customer> queue;

    /**
     * Количество доступного к покупке товара.
     */
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    /**
     * @return имя последнего счастливого обладателя желаемого товара.
     */
    public String getLastHappyCustomer() {
        for (int i = 0; i < count - 1; i++) {
            queue.poll();
        }
        return queue.element().name();
    }

    /**
     * @return имя первого клиента, которому сегодня не повезло и ему не хватило товара.
     */
    public String getFirstUpsetCustomer() {
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
        return queue.element().name();
    }
}