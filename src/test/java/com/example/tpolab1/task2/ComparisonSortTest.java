package com.example.tpolab1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparisonSortTest {

    @Test
    public void checkPositiveSort() {
        assertAll(
                () -> assertArrayEquals(new int[]{3, 4, 5, 33}, ComparisonSort.insertionSort(new int[]{33, 3, 4, 5})),
                () -> assertArrayEquals(new int[]{1,3,4,7,9}, ComparisonSort.insertionSort(new int[]{4,1,3,9,7})),
                () -> assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, ComparisonSort.insertionSort(new int[]{10,9,8,7,6,5,4,3,2,1}))
        );
    }

    @Test
    public void checkNull() {
        assertThrows(NullPointerException.class, () -> ComparisonSort.insertionSort(null));
    }

    @Test
    void checkNegativeValues() {
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, ComparisonSort.insertionSort(new int[]{-5, -1, -4, -3, -2}));
    }

    @Test
    public void checkZeros() {
        assertArrayEquals(new int[]{0,0,0,0,0}, ComparisonSort.insertionSort(new int[]{0,0,0,0,0}));
    }

    @Test
    public void checkEmpty() {
        assertArrayEquals(new int[]{}, ComparisonSort.insertionSort(new int[]{}));
    }
}
