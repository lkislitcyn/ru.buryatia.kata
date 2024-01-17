package ru.buryatia.kata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void calc() {
        Assert.assertEquals("L", Main.calc("X * V"));
    }

    @Test
    public void calc1() {
        Assert.assertEquals("C", Main.calc("X * X"));
    }
    @Test
    public void calc2() {
        Assert.assertEquals("2", Main.calc("10 - 8"));
    }

    @Test
    public void calc3() {
        Assert.assertEquals("-2", Main.calc("8 - 10"));
    }
}