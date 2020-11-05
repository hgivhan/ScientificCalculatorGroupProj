package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Memory;
import org.junit.Assert;
import org.junit.Test;

public class TestMemory {

    @Test
    public void TestMemoryUpdate () {
        Memory memoryFeature = new Memory();
        double input = 3;
        double expectedResult = 3;
        double result = memoryFeature.updateMemory(input);
        Assert.assertEquals(expectedResult, result, 0.00001);
    }
}
