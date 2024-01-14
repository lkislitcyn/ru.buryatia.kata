package ru.buryatia.kata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void calc() {
        Assert.assertEquals("L",Main.calc("X * V"));
    }
}