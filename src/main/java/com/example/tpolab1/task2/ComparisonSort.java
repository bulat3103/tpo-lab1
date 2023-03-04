package com.example.tpolab1.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComparisonSort {
    public static String[] insertionSort(int[] sortArr) {
        if (sortArr == null) throw new NullPointerException();
        if (sortArr.length == 0) return new String[]{};
        Map<Integer, int[]> steps = new HashMap<>();
        steps.put(1, Arrays.copyOf(sortArr, sortArr.length));
        int step = 1;
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
                sortArr[j - 1] = swap;
                steps.put(step++, Arrays.copyOf(sortArr, sortArr.length));
            }
        }
        String[] ans = new String[steps.size()];
        int i = 0 ;
        for (Map.Entry<Integer, int[]> e : steps.entrySet()) {
            StringBuilder line = new StringBuilder();
            for (int k = 0; k < e.getValue().length; k++) {
                if (k == e.getValue().length - 1) {
                    line.append(e.getValue()[k]);
                } else {
                    line.append(e.getValue()[k]).append(" ");
                }
            }
            ans[i++] = line.toString();
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] a = new int[]{0,0,0,0,0};
        String[] steps = insertionSort(a);
        for (int i = 0; i < steps.length; i++) {
            System.out.println(steps[i]);
        }
    }
}
