package com.campusdual.classroom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Exercise10Test {
//    @Test
//    void testRandomWithRange(){
//        //Assertions.assertEquals(1, Exercise10.randomWithRange(1,2));
//        Assertions.assertTrue(0 < Exercise10.randomWithRange(1, 4) && Exercise10.randomWithRange(1, 4) < 4);
//    }
//    @Test
//    void testRandomWithRangeOfMultiplesValues(){
//        List<Integer> possibleValues = new ArrayList<>();
//
//        for (int i = 0; i <= 10 ; i++) {
//            possibleValues.add(i);
//        }
//        int obtainedValue = Exercise10.randomWithRange(1, 11);
//
//        Assertions.assertTrue(possibleValues.contains(obtainedValue));
//    }
    @Test
    void testGetBall(){
        List<String> possibleValues = new ArrayList<>();
        possibleValues.add("rojo");
        possibleValues.add("azul");
        possibleValues.add("verde");

        String obtainedValue = Exercise10.getBall();
        Assertions.assertTrue(possibleValues.contains(obtainedValue));
    }
}
