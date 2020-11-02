package com.zipcodewilmington.scientific_calculator;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

public void testing(){

@Before
    public void setUp(){}

@After
    public void tearDown(){}

@Test
    public void testAdd() {
    Core core1 = new Core();
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = core1.add(a, b);
        Assert.assertEquals(expectedResult, result);
    }
@Test
    public void testSubtract() {
    Core core1 = new Core();
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = core1.subtract(a, b);
        Assert.assertEquals(expectedResult, result);
    }
@Test
    public void testMultiply() {
    Core core1 = new Core();
        double a = 10;
        double b = 25;
        double expectedResult = 250;
        double result = core1.multiply(a, b);
        Assert.assertEquals(expectedResult, result);
    }
@Test
    public void testDivide() {
    Core core1 = new Core();
        double a = 56;
        double b = 10;
        double expectedResult = 5.6;
        double result = core1.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
@Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
    Core core1 = new Core();
    double a = 15;
        double b = 0;
        core1.divide(a, b);
    }
}
}


// @Test
// public void testPay(){
//PayDay payDay1 = new PayDay();
//java.lang.String string1 = payDay1.pay("Kris", 21.5, 10.0, 0.05);
// assertEquals("Kris 215.00 10.75 204.25", string1);}