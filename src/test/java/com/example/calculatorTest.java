package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {
    @Test
    public void testAdd() {
        calculator cc = new calculator();
        assertEquals(5, cc.add(2, 3));
    }
}
