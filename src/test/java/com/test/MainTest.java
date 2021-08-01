package com.test;

import com.application.model.service.CalculateService;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void additionTest(){
        double result = CalculateService.INSTANCE.calculate(3, 4, "+");
        Assert.assertEquals(result, 7.0, 0);
    }

    @Test
    public void subtractionTest(){
        double result = CalculateService.INSTANCE.calculate(3, 4, "-");
        Assert.assertEquals(result, -1.0, 0);
    }

    @Test
    public void multiplicationTest(){
        double result = CalculateService.INSTANCE.calculate(3, 4, "*");
        Assert.assertEquals(result, 12.0, 0);
    }

    @Test
    public void divisionTest(){
        double result = CalculateService.INSTANCE.calculate(4, 2, "/");
        Assert.assertEquals(result, 2.0, 0);
    }

    @Test
    public void exponentiationTest(){
        double result = CalculateService.INSTANCE.calculate(2, 3, "^");
        Assert.assertEquals(result, 8.0, 0);
    }

    @Test
    public void rootExtractionTest(){
        double result = CalculateService.INSTANCE.calculate(4, 2, "|");
        Assert.assertEquals(result, 2.0, 0);
    }
}
