package ru.job4j.array;

public class EndsWith {
    /* проверить. что массив word имеет последние элементы одинаковые с post */
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
