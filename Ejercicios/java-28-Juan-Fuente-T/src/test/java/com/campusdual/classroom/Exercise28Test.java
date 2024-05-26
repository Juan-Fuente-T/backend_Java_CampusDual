package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise28Test {
    @Test
    @DisplayName("Test if main method throws any exception")
    void testLaunchAnyException() {
        assertThrows(Exception.class, () -> Exercise28.main(null), "Exception not thrown");
    }
}