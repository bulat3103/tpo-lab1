package com.example.tpolab1.task2;

public class ComparisonSort {
    public static int[] insertionSort(int[] sortArr) {
        if (sortArr == null) throw new NullPointerException();
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        return sortArr;
    }
}
