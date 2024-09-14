package com.example.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyAppTest {

    private int input;
    private int expected;

    public MyAppTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 0}, {1, 1}, {2, 4}, {10, 100}
        });
    }

    @Test
    public void testMethod() {
        assertEquals(expected, input * input);
    }
}
