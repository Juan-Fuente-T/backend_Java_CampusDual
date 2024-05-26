package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuelTankTest {

    @Test
    @DisplayName("Verify that when a capacity is established, it cannot be negative and does not modify it.")
    void testUpdgradeCapacity() {
        FuelTank ft = new FuelTank();
        ft.setActualFuel(15);
        assertEquals(15, ft.getActualFuel());
        ft.setActualFuel(-8);
        assertEquals(15, ft.getActualFuel());
    }
}
