package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercise21Test {

    @Test
    void testCreateHashSet() {
        Set<String> hashSet = Exercise21.createHashSet();
        assertTrue(hashSet.contains("ELEMENT KPRBC"), "HashSet not contains element \"ELEMENT KPRBC\"");
        assertTrue(hashSet.contains("ELEMENT YPBTM"), "HashSet not contains element \"ELEMENT YPBTM\"");
        assertTrue(hashSet.contains("ELEMENT AADXU"), "HashSet not contains element \"ELEMENT AADXU\"");
        assertTrue(hashSet.contains("ELEMENT RXCGJ"), "HashSet not contains element \"ELEMENT RXCGJ\"");
        assertTrue(hashSet.contains("ELEMENT WYMVD"), "HashSet not contains element \"ELEMENT WYMVD\"");
        assertTrue(hashSet.contains("ELEMENT WFGEJ"), "HashSet not contains element \"ELEMENT WFGEJ\"");
        assertTrue(hashSet.contains("ELEMENT TYGBS"), "HashSet not contains element \"ELEMENT TYGBS\"");
        assertTrue(hashSet.contains("ELEMENT MAPTK"), "HashSet not contains element \"ELEMENT MAPTK\"");
        assertTrue(hashSet.contains("ELEMENT GJXVE"), "HashSet not contains element \"ELEMENT GJXVE\"");
        assertTrue(hashSet.contains("ELEMENT BAFGL"), "HashSet not contains element \"ELEMENT BAFGL\"");
        assertEquals(10, hashSet.size());
    }

    @Test
    void testCreateTreeSet() {
        Set<String> treeSet = Exercise21.createTreeSet();
        assertTrue(treeSet.contains("ELEMENT KPRBC"), "HashSet not contains element \"ELEMENT KPRBC\"");
        assertTrue(treeSet.contains("ELEMENT YPBTM"), "HashSet not contains element \"ELEMENT YPBTM\"");
        assertTrue(treeSet.contains("ELEMENT AADXU"), "HashSet not contains element \"ELEMENT AADXU\"");
        assertTrue(treeSet.contains("ELEMENT RXCGJ"), "HashSet not contains element \"ELEMENT RXCGJ\"");
        assertTrue(treeSet.contains("ELEMENT WYMVD"), "HashSet not contains element \"ELEMENT WYMVD\"");
        assertTrue(treeSet.contains("ELEMENT WFGEJ"), "HashSet not contains element \"ELEMENT WFGEJ\"");
        assertTrue(treeSet.contains("ELEMENT TYGBS"), "HashSet not contains element \"ELEMENT TYGBS\"");
        assertTrue(treeSet.contains("ELEMENT MAPTK"), "HashSet not contains element \"ELEMENT MAPTK\"");
        assertTrue(treeSet.contains("ELEMENT GJXVE"), "HashSet not contains element \"ELEMENT GJXVE\"");
        assertTrue(treeSet.contains("ELEMENT BAFGL"), "HashSet not contains element \"ELEMENT BAFGL\"");
        assertEquals(10, treeSet.size());
    }

    @Test
    void testBothSetHasSameElements() {
        Set<String> hashSet = Exercise21.createHashSet();
        Set<String> treeSet = Exercise21.createTreeSet();
        hashSet.containsAll(treeSet);
    }

    @Test
    void testAddNewData() {
        Set<String> hashSet = Exercise21.createHashSet();
        Set<String> treeSet = Exercise21.createTreeSet();
        assertTrue(hashSet.add("ELEMENT AAA"), "ELEMENT AAA cannot be added to hashSet");
        assertTrue(treeSet.add("ELEMENT AAA"), "ELEMENT AAA cannot be added to treeSet");
    }

    @Test
    void testAddDuplicateData() {
        Set<String> hashSet = Exercise21.createHashSet();
        Set<String> treeSet = Exercise21.createTreeSet();
        hashSet.add("ELEMENT AAA");
        assertFalse(hashSet.add("ELEMENT AAA"), "ELEMENT AAA added to hashSet");
        treeSet.add("ELEMENT AAA");
        assertFalse(treeSet.add("ELEMENT AAA"), "ELEMENT AAA added to hashSet");
    }
}