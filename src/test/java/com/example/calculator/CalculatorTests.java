package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    0,   1",
            "5,    2,   3",
            "151,  51, 100",
            "201,  100, 101"
    })
    void minus(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.minus(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "4,    2,   2",
            "8,  2, 4",
            "200,  100, 2"
    })
    void devide(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.devide(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "d,    1,   1",
            "ads,    2,   3",
            "qwd,  2, 4",
            "safd,  100, 103"
    })
    void devideee(String first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.devideee(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

//    @ParameterizedTest(name = "{0} / {1} = {2}")
//    @CsvSource({
//            "d,    1,   1",
//            "ads,    2,   3",
//            "qwd,  2, 4",
//            "safd,  100, 103"
//    })
//    void devideeese(String first, int second, int expectedResult) {
//        Calculator calculator = new Calculator();
//        assertEquals(expectedResult, calculator.devideese(first, second),
//                () -> first + " / " + second + " should equal " + expectedResult);
//    }
}