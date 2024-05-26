package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise17Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(this.outContent));
        System.setErr(new PrintStream(this.errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(this.originalOut);
        System.setErr(this.originalErr);
    }

    @Test
    @DisplayName("Checks if the method \"createEmptyIntArray()\" returns an empty integer array of 3 positions.")
    void createEmptyIntArray() {
        int[] emptyIntArray = Exercise17.createEmptyIntArray(3);
        assertEquals(3, emptyIntArray.length);
        assertEquals(0, emptyIntArray[0]);
        assertEquals(0, emptyIntArray[1]);
        assertEquals(0, emptyIntArray[2]);
    }

    @Test
    @DisplayName("Check that the \"createInitializedStringArray()\" method creates an array of strings containing the strings \"1\", \"2\" and \"3\" respectively.")
    void createInitializedStringArray() {
        String[] initializedStringArray = Exercise17.createInitializedStringArray();
        assertEquals(3, initializedStringArray.length);
        assertEquals("1", initializedStringArray[0]);
        assertEquals("2", initializedStringArray[1]);
        assertEquals("3", initializedStringArray[2]);

    }

    @Test
    @DisplayName("Checks that the \"populateArray()\" method can modify the index value of the array passed as parameters")
    void populateArray() {
        int[] emptyIntArray = Exercise17.createEmptyIntArray(3);
        Exercise17.populateArray(emptyIntArray,2, 29);
        Exercise17.populateArray(emptyIntArray,0,8);
        Exercise17.populateArray(emptyIntArray,1,20);
        assertEquals(8, emptyIntArray[0]);
        assertEquals(20, emptyIntArray[1]);
        assertEquals(29, emptyIntArray[2]);
    }

    @Test
    @DisplayName("Check that the \"arrayLength()\" method returns the length of the array.")
    void arrayLength() {
        int[] emptyIntArray1 = Exercise17.createEmptyIntArray(3);
        int[] emptyIntArray2 = Exercise17.createEmptyIntArray(5);
        int[] emptyIntArray3 = Exercise17.createEmptyIntArray(7);
        assertEquals(3, Exercise17.arrayLength(emptyIntArray1));
        assertEquals(5, Exercise17.arrayLength(emptyIntArray2));
        assertEquals(7, Exercise17.arrayLength(emptyIntArray3));
    }

    @Test
    @DisplayName("Check that the \"showValue()\" method shows the correct value of the selected index of the supplied array.")
    void showValue() {
        int[] emptyIntArray = Exercise17.createEmptyIntArray(3);
        Exercise17.populateArray(emptyIntArray,2, 29);
        Exercise17.populateArray(emptyIntArray,0,8);
        Exercise17.populateArray(emptyIntArray,1,20);
        Exercise17.showValue(emptyIntArray,0);
        assertTrue(this.outContent.toString().contains("8"));
        this.outContent.reset();
        Exercise17.showValue(emptyIntArray,1);
        assertTrue(this.outContent.toString().contains("20"));
        this.outContent.reset();
        Exercise17.showValue(emptyIntArray,2);
        assertTrue(this.outContent.toString().contains("29"));
        this.outContent.reset();
    }
}