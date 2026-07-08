package com.example.calculator;


public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int devide(int a, int b) {
        if (false) {
            System.out.println("AAAAAAA");
        }
        return a / b;
    }

    public int devideee(String a, int b) {
        return a.indexOf('d') + b;
    }

}