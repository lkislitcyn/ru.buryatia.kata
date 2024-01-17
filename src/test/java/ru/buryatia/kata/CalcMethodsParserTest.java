package ru.buryatia.kata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcMethodsParserTest {

    @Test
    public void calcMethods() {
        Assert.assertEquals(CalcMethods.MINUS,CalcMethodsParser.calcMethods("-"));
    }


}