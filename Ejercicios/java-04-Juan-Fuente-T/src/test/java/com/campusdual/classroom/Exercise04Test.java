package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {

    @Test
    @DisplayName("Sum first 5 integer numbers")
    void testSumFirst5Num(){
        assertEquals(15, Exercise04.sumNum(5), "Sum is not correct");
    }

    @Test
    @DisplayName("Sum first 20 even numbers")
    void testSumFirst20EvenNum(){
        assertEquals(420, Exercise04.sumEvenNum(20), "Sum is nor correct");
    }

    @Test
    @DisplayName("Calculate factorial of 7")
    void testFactorialNum(){
        assertEquals(5040, Exercise04.factorial(7), "Factorial is not correct");
    }

    @Test
    @DisplayName("Calculate factorial of 7 by recursive method")
    void testRecursiveFactorialNum(){
        assertEquals(5040, Exercise04.recursiveFactorial(7), "Factorial is not correct");
    }


}