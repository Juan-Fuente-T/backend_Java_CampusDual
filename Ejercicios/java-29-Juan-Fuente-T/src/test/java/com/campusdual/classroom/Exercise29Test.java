package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise29Test {
    @Test
    @DisplayName("Test if main method does not throws any exception")
    void testDoesNotLaunchAnyException() {
        assertDoesNotThrow(() -> Exercise29.main(null), "Exception throwed");
    }
}