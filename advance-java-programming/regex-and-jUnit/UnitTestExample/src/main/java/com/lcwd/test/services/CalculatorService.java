package com.lcwd.test.services;

public class CalculatorService {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int product(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        return a /b;
    }
    public static int sumAnyNumber(int ...numbers){
        int sum = 0;
        for(int n : numbers){
            sum += n;
        }
        return sum;
    }
}
