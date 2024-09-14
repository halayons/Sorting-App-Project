package com.example.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CornerCaseTest {

    @Test
    public void testWithZeroArgs() {
        assertTrue(MyApp.methodWithArgs() == 0);
    }

    @Test
    public void testWithOneArg() {
        assertTrue(MyApp.methodWithArgs(1) == 1);
    }

    @Test
    public void testWithTenArgs() {
        assertTrue(MyApp.methodWithArgs(1,2,3,4,5,6,7,8,9,10) == 55);
    }

    @Test
    public void testWithMoreThanTenArgs() {
        assertTrue(MyApp.methodWithArgs(1,2,3,4,5,6,7,8,9,10,11,12) == 78);
    }
}

