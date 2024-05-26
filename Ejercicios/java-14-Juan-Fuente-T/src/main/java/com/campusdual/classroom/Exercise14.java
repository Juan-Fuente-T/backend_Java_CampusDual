package com.campusdual.classroom;

public class Exercise14 {

    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        p.getDetails();
        Teacher t = new Teacher("Maria", "Montessori", "Educación");
        t.getDetails();
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        po.getDetails();
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");
        d.getDetails();
    }

}