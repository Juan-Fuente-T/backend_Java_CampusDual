package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07Test {

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
    @DisplayName("Perform a search in a reverse list 10 first integers")
    void positionInAList() {
        Exercise07.positionInAList(8);
        boolean find = this.outContent.toString().contains(" se ha encontrado.");
        this.outContent.reset();
        assertTrue(find, "Number exist in list");
        Exercise07.positionInAList(20);
        boolean notFind = this.outContent.toString().contains(" no se encuentra en la lista.");
        assertTrue(notFind, "Number does not exist in list");
    }

    @Test
    @DisplayName("Sum the first N integers")
    void sumFirstNaturalNumbers() {
        Exercise07.sumFirstNaturalNumbers(10);
        boolean checkSum = this.outContent.toString().contains("55");
        assertTrue(checkSum, "Sum is not correct");

    }

    @Test
    @DisplayName("Shows a list of N first integer numbers")
    void showFirstNaturalNumbers() {
        int n1 = 20;
        Exercise07.showFirstNaturalNumbers(n1);
        boolean flag = true;
        for (int i = 0; i<n1 ; i++){
            if (!this.outContent.toString().contains(String.valueOf(i+1))){
                flag = false;
                break;
            }
        }
        assertTrue(flag, "Not contains all first" + n1 + "numbers");
    }
}