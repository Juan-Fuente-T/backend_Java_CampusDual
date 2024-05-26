package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise09Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        this.outContent.reset();
        this.errContent.reset();
        System.setOut(new PrintStream(this.outContent));
        System.setErr(new PrintStream(this.errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(this.originalOut);
        System.setErr(this.originalErr);
    }


    @Test
    @DisplayName("Check do-while loop iterations")
    void testDoWhileLoopIterations() {
        int n1 = 15;
        Exercise09.doWhileLoop(n1);
        for (int num = 0; num < n1; num++) {
            String expectedMessage = "Entra con valor: "+num+", sale con valor: "+(num+1);
            assertTrue(this.outContent.toString().contains(expectedMessage), "Loop inspection message is not correct");
        }
    }
}
