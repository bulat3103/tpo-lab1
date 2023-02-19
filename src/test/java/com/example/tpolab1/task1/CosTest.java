package com.example.tpolab1.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosTest {
    double eps = 0.1;
    int n = 10;

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI, -0.5 * Math.PI, 0, 0.5 * Math.PI, Math.PI})
    public void checkPiDots(double param) {
        assertAll(() -> assertEquals(Math.cos(param), Cos.calc(param, n), eps));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2 * Math.PI, 2 * Math.PI})
    public void checkPiDotsOutPiAndMinusPi(double param) {
        assertAll(() -> assertEquals(Math.cos(param), Cos.calc(param, n), eps));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-10, -5, 5, 10})
    public void checkDotsOutPiAndMinusPi(double param) {
        assertAll(() -> assertEquals(Math.cos(param), Cos.calc(param, n), eps));
    }
}
