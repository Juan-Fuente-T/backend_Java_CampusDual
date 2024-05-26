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

import static org.junit.jupiter.api.Assertions.*;

class Exercise23Test {

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
    @DisplayName("Check if createHashMap creates a specific HashMap")
    void testCreateMap() {
        Map<String, Person> map = Exercise23.createHashMap();
        assertTrue(map.containsKey("person"), "The map does not contain the key \"person\"");
        assertTrue(map.containsKey("teacher"),"The map does not contain the key \"teacher\"");
        assertTrue(map.containsKey("police"),"The map does not contain the key \"police\"");
        assertTrue(map.containsKey("doctor"),"The map does not contain the key \"doctor\"");
        assertEquals("John", map.get("person").getName(), "The attribute \"name\" of the person associated to the key \"person\" is not John");
        assertEquals("Smith", map.get("person").getSurname(), "The attribute \"surname\" of the person associated to the key \"person\" is not Smith");
        assertEquals("María", map.get("teacher").getName(), "The attribute \"name\" of the person associated to the key \"teacher\" is not María");
        assertEquals("Montessori", map.get("teacher").getSurname(), "The attribute \"surname\" of the person associated to the key \"teacher\" is not Montessori");
        assertEquals("Educación", ((Teacher)map.get("teacher")).getArea(), "The attribute \"area\" of the teacher associated to the key \"teacher\" is not Educación");
        assertEquals("Jake", map.get("police").getName(), "The attribute \"name\" of the person associated to the key \"police\" is not Jake");
        assertEquals("Peralta", map.get("police").getSurname(), "The attribute \"surname\" of the person associated to the key \"police\" is not Peralta");
        assertEquals("B-99", ((PoliceOfficer)map.get("police")).getSquad(), "The attribute \"squad\" of the police officer associated to the key \"police\" is not B-99");
        assertEquals("Gregory", map.get("doctor").getName(), "The attribute \"name\" of the person associated to the key \"doctor\" is not Jake");
        assertEquals("House", map.get("doctor").getSurname(), "The attribute \"surname\" of the person associated to the key \"doctor\" is not House");
        assertEquals("Nefrología e infectología", ((Doctor)map.get("doctor")).getSpecialization(), "The attribute \"specialization\" of the doctor associated to the key \"doctor\" is not Nefrología e infectología");
        assertTrue(map.get("person") instanceof Person, "The key value \"person\" is not an instance of \"Person\"");
        assertTrue(map.get("teacher") instanceof Teacher, "The key value \"teacher\" is not an instance of \"Teacher\"");
        assertTrue(map.get("police") instanceof PoliceOfficer, "The key value \"police\" is not an instance of \"PoliceOfficer\"");
        assertTrue(map.get("doctor") instanceof Doctor, "The key value \"doctor\" is not an instance of \"Doctor\"");
    }

    @Test
    @DisplayName("Test if printed HashMap contains the getDetails() of a Person")
    void testPrintMap() {
        Map<String, Person> hashMap = Exercise23.createHashMap();
        Exercise23.printMapValues(hashMap);
        String out = this.outContent.toString();
        this.outContent.reset();
        for (Map.Entry<String, Person> entry : hashMap.entrySet()){
            entry.getValue().getDetails();
            assertTrue(out.contains(this.outContent.toString()), "printMapValues() does not contains: " + this.outContent.toString() +"");
            this.outContent.reset();
        }
    }

    @Test
    @DisplayName("Verifies adding a new value to an existing key")
    void testAddExistingKey() {
        Map<String, Person> hashMap = Exercise23.createHashMap();
        Person person = Exercise23.addMapValue(hashMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        assertTrue(person != hashMap.get("police"));
    }

}
