package ru.buryatia.kata;

import org.junit.Assert;
import org.junit.Test;



public class CheckNumberTest {

    @Test
    public void checkRomanNumerals() {
        CheckNumber checkNumber = new CheckNumber();
        Assert.assertTrue(checkNumber.checkArabianNumerals("7"));
    }

    @Test
    public void checkArabianNumerals() {
        CheckNumber checkNumber = new CheckNumber();
        Assert.assertTrue(checkNumber.checkRomanNumerals("VII"));
    }
}