package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationsTest {

    @Test
    public void testReverse() {

        StringOperations obj = new StringOperations();

        assertEquals("avaJ", obj.reverse("Java"));
    }

    @Test
    public void testIsEmpty() {

        StringOperations obj = new StringOperations();

        assertTrue(obj.isEmpty(""));
    }

    @Test
    public void testUpperCase() {

        StringOperations obj = new StringOperations();

        assertEquals("HELLO", obj.toUpper("hello"));
    }
}
