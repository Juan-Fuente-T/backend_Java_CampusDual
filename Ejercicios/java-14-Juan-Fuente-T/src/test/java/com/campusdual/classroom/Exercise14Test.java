package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise14Test {

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
    @DisplayName("Person getDetails() method prints in console a message with → Name, Surname")
    void testPersonDetail() {
        String name = "John";
        String surname = "Doe";
        Person p = new Person(name, surname);
        p.getDetails();
        assertTrue(this.outContent.toString().contains(name), "Method getDetail does not contains name");
        assertTrue(this.outContent.toString().contains(surname), "Method getDetail does not contains surname");
    }

    @Test
    @DisplayName("Doctor getDetails() method prints in console a message with → Name, Surname, Specialization")
    void testDoctorDetail() {
        String name = "John";
        String surname = "Doe";
        String specialization = "Anonymity";
        Doctor d = new Doctor(name, surname, specialization);
        d.getDetails();
        assertTrue(this.outContent.toString().contains(name), "Method getDetail() in Doctor does print name");
        assertTrue(this.outContent.toString().contains(surname), "Method getDetail() in Doctor does not print surname");
        assertTrue(this.outContent.toString().toLowerCase().contains(specialization.toLowerCase()), "Method getDetail() in Doctor does not print specialization");

    }
}