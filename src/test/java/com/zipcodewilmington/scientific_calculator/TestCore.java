package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Core;
import org.junit.Assert;
import org.junit.Test;

public class TestCore {

    @Test
    public void TestAdd() {
        Core core1 = new Core();
        double num1 = 10;
        double num2 = 11;
        double expectedResult = 21;
        double result = core1.add(num1, num2);
        Assert.assertEquals(expectedResult, result, 0.000001);
    }
    @Test
    public void testSubtract() {
        Core core1 = new Core();
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = core1.subtract(a, b);
        Assert.assertEquals(expectedResult, result, 0.000001);
    }

    @Test
    public void testMultiply() {
        Core core1 = new Core();
        double a = 10;
        double b = 25;
        double expectedResult = 250;
        double result = core1.multiply(a, b);
        Assert.assertEquals(expectedResult, result, 0.000001);
    }

    @Test
    public void testDivide() {
        Core core1 = new Core();
        double a = 56;
        double b = 10;
        double expectedResult = 5.6;
        double result = core1.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.000001);
    }

    @Test
    public void testDivideByZero() { // doesn't work
        Core core1 = new Core();
        double a = 56;
        double b = 0;
        double expectedResult = Double.NaN;
        double result = 0;
        Assert.assertEquals(expectedResult, result, 0.00001);
    }

}
