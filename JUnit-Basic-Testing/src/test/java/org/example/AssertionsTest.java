package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2,3));

        assertNotEquals(10, calculator.add(2,3));

        assertTrue(10 > 5);

        assertFalse(5 > 10);

        assertNull(null);

        assertNotNull(calculator);

        int[] expected = {1,2,3};

        int[] actual = {1,2,3};

        assertArrayEquals(expected, actual);

        assertSame(calculator, calculator);

        assertNotSame(new Calculator(), new Calculator());
    }
}
