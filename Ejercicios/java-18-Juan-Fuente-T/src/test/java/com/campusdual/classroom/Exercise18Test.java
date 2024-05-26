package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise18Test {

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
    @DisplayName("Create an array of N positions and initialize it with the first N natural numbers.")
    void testCreateAndInitializeArray() {
        int num = 5;
        int[] intArray = Exercise18.createAndInitializeArray(num);
        for (int i = 0; i < num; i++){
           assertEquals(i+1, intArray[i]);
        }
    }

    @Test
    @DisplayName("Display each element of an array separated by a space.")
    void testShowInlineArrayWhitespaces() {
        int num = 5;
        int[] intArray = Exercise18.createAndInitializeArray(num);
        Exercise18.showInlineArray(intArray);
        long count = this.outContent.toString().chars().filter(w -> w == (int) ' ').count();
        assertEquals(num-1, count);
    }

    @Test
    @DisplayName("Check if the array contains the first N natural numbers.")
    void testShowInlineArrayContent() {
        int num = 5;
        int[] intArray = Exercise18.createAndInitializeArray(num);
        Exercise18.showInlineArray(intArray);
        for (int i = 0; i < num; i++){
            assertTrue(this.outContent.toString().contains(Integer.toString(i+1)));
        }
    }
}