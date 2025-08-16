package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] leftArray, int[] rightArray) {
        int[] resultArray = new int[leftArray.length + rightArray.length];
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            resultArray[k++] = leftArray[i] < rightArray[j] ? leftArray[i++] :  rightArray[j++];
        }

        while (i < leftArray.length) {
            resultArray[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            resultArray[k++] = rightArray[j++];
        }

        return resultArray;
    }
}

