package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

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
    @DisplayName("Test if the circumference area is correct")
    void testCircumferenceArea(){
        Exercise02.main(new String[0]);
        boolean check = this.outContent.toString().contains("706");
        assertTrue(check, "Circumference area is not correct. Approx: 706.5");
    }

    @Test
    @DisplayName("Test if the circumference length is correct")
    void testCircumferenceLength(){
        Exercise02.main(new String[0]);
        boolean check = this.outContent.toString().contains("94");
        assertTrue(check, "Circumference length is not correct. Approx: 94.2");
    }

}