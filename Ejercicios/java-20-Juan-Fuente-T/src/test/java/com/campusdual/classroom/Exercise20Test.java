package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise20Test {

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
    @DisplayName("Check that a list of 4 objects of type person (Person, Teacher, PoliceOfficer and Doctor) is created.")
    void testCreateListOfPeople() {
        List<Person> peopleList = Exercise20.getPeopleList();
        assertTrue(peopleList.get(0) instanceof Person, "Item in position 0 is not a Person");
        assertTrue(peopleList.get(1) instanceof Teacher, "Item in position 1 is not a Teacher, which does not extend the class Person");
        assertTrue(peopleList.get(2) instanceof PoliceOfficer, "Item in position 2 is not a PoliceOfficer, which does not extend the class Person");
        assertTrue(peopleList.get(3) instanceof Doctor, "Item in position 3 is not a Doctor, which does not extend the class Person");
        assertEquals(4, peopleList.size(), "The list has more than 4 items");
    }

    @Test
    @DisplayName("Check that a list of 4 objects of type person (Person, Teacher, PoliceOfficer and Doctor) is created.")
    void testShowPeopleDetail() {
        List<Person> peopleList = Exercise20.getPeopleList();
        Exercise20.showPeopleDetails(peopleList);
        String exStdOutput = this.outContent.toString();
        this.outContent.reset();
        peopleList.get(0).getDetails();
        String personDetails = this.outContent.toString();
        assertTrue(exStdOutput.contains(personDetails));
        this.outContent.reset();
        peopleList.get(1).getDetails();
        String teacherDetails = this.outContent.toString();
        assertTrue(exStdOutput.contains(teacherDetails));
        this.outContent.reset();
        peopleList.get(2).getDetails();
        String policeOfficerDetails = this.outContent.toString();
        assertTrue(exStdOutput.contains(policeOfficerDetails));
        this.outContent.reset();
        peopleList.get(3).getDetails();
        String doctorDetails = this.outContent.toString();
        assertTrue(exStdOutput.contains(doctorDetails));
    }
}