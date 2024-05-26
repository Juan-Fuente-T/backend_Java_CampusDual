package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Exercise25Test {

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
        this.outContent.reset();
        this.errContent.reset();
        System.setOut(this.originalOut);
        System.setErr(this.originalErr);
    }

    @Test
    @DisplayName("Check stack creation")
    void testCheckQueueCreation() {
        Stack<String> stack = Exercise25.createStack();
        assertEquals("House", stack.pop(), "Removed element is not correct");
        assertEquals("Peralta", stack.pop(), "Removed element is not correct");
        assertEquals("Montessori", stack.pop(), "Removed element is not correct");
        assertEquals("Smith", stack.pop(), "Removed element is not correct");
    }

    @Test
    @DisplayName("Check if the stack prints the elements in correct order")
    void testPrintMethod() {
        Stack<String> stack = Exercise25.createStack();
        Exercise25.printAndEmptyStack(stack);
        String content = this.outContent.toString();
        assertTrue(content.indexOf("House")<content.indexOf("Peralta"), "Elements are not printed in correct order");
        assertTrue(content.indexOf("Peralta")<content.indexOf("Montessori"), "Elements are not printed in correct order");
        assertTrue(content.indexOf("Montessori")<content.indexOf("Smith"), "Elements are not printed in correct order");
    }
}
