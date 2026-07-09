package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {

        calculator = new Calculator();

        System.out.println("Setup Completed");
    }

    @After
    public void tearDown() {

        calculator = null;

        System.out.println("Teardown Completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a,b);

        // Assert
        assertEquals(30,result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a,b);

        // Assert
        assertEquals(15,result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.multiply(a,b);

        // Assert
        assertEquals(20,result);
    }

    @Test
    public void testDivision() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.divide(a,b);

        // Assert
        assertEquals(4,result);
    }
}
