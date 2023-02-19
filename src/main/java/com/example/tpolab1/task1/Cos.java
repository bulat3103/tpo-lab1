package com.example.tpolab1.task1;

public class Cos {
    public static double calc(double x, int n) {
        double PI2 = Math.PI * 2;
        if (x > Math.PI) {
            while (x > Math.PI) {
                x -= PI2;
            }
        } else if (x < -Math.PI){
            while (x < -Math.PI) {
                x += PI2;
            }
        }
        double result = 0;
        int sign = 1;
        double pow = 1;
        double xx = x * x;
        for (int i = 0; i <= n; i++) {
            result += sign * pow / fact(i);
            sign = -sign;
            pow *= xx;
        }
        return result;
    }

    private static long fact(int n) {
        long fact = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact *= i;
        }
        return fact;
    }
}
