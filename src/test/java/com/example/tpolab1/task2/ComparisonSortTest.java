package com.example.tpolab1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparisonSortTest {

    @Test
    public void checkPositiveSort() {
        assertAll(
                () -> assertArrayEquals(new String[]{"3 33 4 5", "3 4 33 5", "3 4 5 33"}, ComparisonSort.insertionSort(new int[]{33, 3, 4, 5})),
                () -> assertArrayEquals(new String[]{"9 10 8 7 6", "9 8 10 7 6", "8 9 10 7 6", "8 9 7 10 6", "8 7 9 10 6",
                        "7 8 9 10 6", "7 8 9 6 10", "7 8 6 9 10", "7 6 8 9 10", "6 7 8 9 10"}, ComparisonSort.insertionSort(new int[]{10,9,8,7,6}))
        );
    }

    @Test
    public void checkNull() {
        assertThrows(NullPointerException.class, () -> ComparisonSort.insertionSort(null));
    }

    @Test
    void checkNegativeValues() {
        assertArrayEquals(new String[]{"-5 -4 -1 -3 -2", "-5 -4 -3 -1 -2", "-5 -4 -3 -2 -1"}, ComparisonSort.insertionSort(new int[]{-5, -1, -4, -3, -2}));
    }

    @Test
    public void checkZeros() {
        assertArrayEquals(new String[]{"0 0 0 0 0"}, ComparisonSort.insertionSort(new int[]{0,0,0,0,0}));
    }

    @Test
    public void checkEmpty() {
        assertArrayEquals(new String[]{}, ComparisonSort.insertionSort(new int[]{}));
    }
}
