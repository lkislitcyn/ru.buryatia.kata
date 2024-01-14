package ru.buryatia.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTranslateTest {

    @Test
    public void fromRomeToArabic() {
        Assert.assertEquals(9, NumberTranslate.fromRomeToArabic("IX"));

    }

    @Test
    public void fromArabicToRome() {
        Assert.assertEquals("VIII", NumberTranslate.fromArabicToRome(8));
    }
}