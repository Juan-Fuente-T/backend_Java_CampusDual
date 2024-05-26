package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {
    public static Map<String, Person> createHashMap() {
        Map<String, Person> newMap = new HashMap<>();
        newMap.put("person", new Person("John", "Smith"));
        newMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        newMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        newMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        return  newMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return map.get(map.get(key));
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()){
            entry.getValue().getDetails();}
    }

    public static void main(String[] args) {
        Map<String, Person> newMap= createHashMap();
        Person p = addMapValue(newMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(newMap);
    }
}
