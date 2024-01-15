package ru.buryatia.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CheckNumberTest {
    CheckNumber checkNumber;

    @Before
    public void initClass() {
        checkNumber = new CheckNumber();
    }

    @Test
    public void checkRomanNumerals() {
        Assert.assertTrue(checkNumber.checkArabianNumerals("7"));
    }

    @Test
    public void checkArabianNumerals() {
        Assert.assertTrue(checkNumber.checkRomanNumerals("VII"));
    }
}