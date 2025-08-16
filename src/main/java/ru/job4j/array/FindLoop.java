package ru.job4j.array;

public class FindLoop {
    /**
     * Поиск по массиву в указанном диапазоне.
     * @param data - массив чисел,
     * @param el - элемент, который нужно найти,
     * @param start - индекс, с которого начинаем поиск,
     * @param finish - индекс, которым заканчиваем поиск.
     * @return - индекс элемента.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (el == data[i]) {
                return i;
            }
        }
        return -1; /* если элемента нет в массиве, то возвращаем -1. */
    }

    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
