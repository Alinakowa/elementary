package ru.calculator;

public class Calculator {

    public static int plus(int first, int second) {
        int result = first + second;
        return result;
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int number = plus(100, 500);
        System.out.println(plus(4, 5));
        plus(4, 2);
        plus(3, 5);
        minus(4, 6);
    }
}
