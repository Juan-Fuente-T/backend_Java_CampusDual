package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercise22Test {

    @Test
    @DisplayName("Creating specific ArrayList")
    void testCreateArrayList() {
        List<String> arrayList = Exercise22.createArrayList();
        assertTrue(arrayList.contains("GKFFD"), "ArrayList does not contains GKFFD element");
        assertTrue(arrayList.contains("TNANA"), "ArrayList does not contains TNANA element");
        assertTrue(arrayList.contains("MPMSL"), "ArrayList does not contains MPMSL element");
        assertTrue(arrayList.contains("PSWME"), "ArrayList does not contains PSWME element");
        assertTrue(arrayList.contains("LZMLF"), "ArrayList does not contains LZMLF element");
        assertTrue(arrayList.contains("JYEBV"), "ArrayList does not contains JYEBV element");
        assertTrue(arrayList.contains("YELNT"), "ArrayList does not contains YELNT element");
        assertTrue(arrayList.contains("JSNKR"), "ArrayList does not contains JSNKR element");
        assertTrue(arrayList.contains("JFESF"), "ArrayList does not contains JFESF element");
        assertTrue(arrayList.contains("TMJLL"), "ArrayList does not contains TMJLL element");
        assertEquals(0, arrayList.indexOf("GKFFD"), "ArrayList does not contains GKFFD element at position 0");
        assertEquals(1, arrayList.indexOf("TNANA"), "ArrayList does not contains TNANA element at position 1");
        assertEquals(2, arrayList.indexOf("MPMSL"), "ArrayList does not contains MPMSL element at position 2");
        assertEquals(3, arrayList.indexOf("PSWME"), "ArrayList does not contains PSWME element at position 3");
        assertEquals(4, arrayList.indexOf("LZMLF"), "ArrayList does not contains LZMLF element at position 4");
        assertEquals(5, arrayList.indexOf("JYEBV"), "ArrayList does not contains JYEBV element at position 5");
        assertEquals(6, arrayList.indexOf("YELNT"), "ArrayList does not contains YELNT element at position 6");
        assertEquals(7, arrayList.indexOf("JSNKR"), "ArrayList does not contains JSNKR element at position 7");
        assertEquals(8, arrayList.indexOf("JFESF"), "ArrayList does not contains JFESF element at position 8");
        assertEquals(9, arrayList.indexOf("TMJLL"), "ArrayList does not contains TMJLL element at position 9");
    }

    @Test
    @DisplayName("Add unique element to ArrayList")
    void testAddUniqueElement() {
        List<String> arrayList = Exercise22.createArrayList();
        boolean addedElement = Exercise22.addElementToList(arrayList, "AAAAA");
        assertTrue(addedElement, "Element AAAAA added succesfully");

    }

    @Test
    @DisplayName("Add duplicate element to ArrayList")
    void testAddDuplicateElment() {
        List<String> arrayList = Exercise22.createArrayList();
        boolean addedElement1 = Exercise22.addElementToList(arrayList, "AAAAA");
        boolean addedElement2 = Exercise22.addElementToList(arrayList, "AAAAA");
        assertTrue(addedElement1, "First element AAAAA added succesfully");
        assertTrue(addedElement2, "Second element AAAAA added succesfully");
        assertTrue(arrayList.indexOf("AAAAA") != arrayList.lastIndexOf("AAAAA"), "First element and second element are in the same position)" );


    }
}