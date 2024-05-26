package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Exercise24Test {

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
    @DisplayName("Check queue creation")
    void testCheckQueueCreation() {
        Queue<String> queue = Exercise24.createQueue();
        assertEquals("Smith", queue.poll());
        assertEquals("Montessori", queue.poll());
        assertEquals("Peralta", queue.poll());
        assertEquals("House", queue.poll());
    }

    @Test
    @DisplayName("Check if the queue prints the elements in correct order")
    void testPrintMethod() {
        Queue<String> queue = Exercise24.createQueue();
        Exercise24.printAndEmptyQueue(queue);
        String content = this.outContent.toString();
        assertTrue(content.indexOf("Montessori")>content.indexOf("Smith"));
        assertTrue(content.indexOf("Peralta")>content.indexOf("Montessori"));
        assertTrue(content.indexOf("House")>content.indexOf("Peralta"));
    }
}
