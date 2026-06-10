package com.lcwd.test.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {

    @BeforeAll
    public static void init(){
        System.out.println("Before all test cases");
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test cases");
    }
    @BeforeEach
    public void beforeTestCases(){
        System.out.println("Before test cases");
    }
    @AfterEach
    public void afterTestCases(){
        System.out.println("After test cases");
    }
    @Test
    public void addTest(){
        System.out.println("Add two numbers");
        int actual = CalculatorService.add(5,7);
        int expected = 12;
        Assertions.assertEquals(expected, actual, "Test Case Failed");
    }
    @Test
    public void subTest(){
        System.out.println("Sub two numbers");
        int actual = CalculatorService.sub(12, 6);
        int expected = 6;
        Assertions.assertEquals(expected, actual, "Test Case Failed");
    }
    @Test
    public void productTest(){
        System.out.println("Product two numbers");
        int actual = CalculatorService.product(5, 5);
        int expected = 25;
        Assertions.assertEquals(expected, actual, "Test Case Failed");
    }
    @Test
    public void divideTest(){
        System.out.println("Divide two numbers");
        double actual = CalculatorService.divide(15, 5);
        double expected = 3;
        Assertions.assertEquals(expected, actual, "Test Case Failed");
    }
    @Test
    public void sumAnyNumberTest(){
        System.out.println("Sum any numbers");
        int actual = CalculatorService.sumAnyNumber(10, 22, 1, 24, 26, 6);
        int expected = 89;
        Assertions.assertEquals(expected, actual, "Test Case Failed");
    }
}
