package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        // Координаты за пределами доски.
        if ((x1 > 7 || y1 > 7 || x2 > 7 || y2 > 7) || (x1 < 0  || y1 < 0 || x2 < 0 || y2 < 0)) {
            return 0;
        }
        // Фигура ходит не по диагонали.
        if (Math.abs(x2 - x1) != Math.abs(y2 - y1)) {
            return 0;
        }
        // Количество шагов.
        return Math.abs(x2 - x1);
    }
}