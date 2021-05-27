package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        // Поиск заполненной ячейки в диагонали
        char[] diagonal = extractDiagonal(board);
        int index = -1;
        for (int i = 0; i < diagonal.length; i++) {
            if ('X' == diagonal[i]) {
                index = i;
            }
        }
        // Диагональ пустая
        if (index < 0) {
            return false;
        }
        // Проверка строки и столбца данной диагонали
        if (monoHorizontal(board, index) || monoVertical(board, index)) {
            return true;
        }
        return false;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }
}
