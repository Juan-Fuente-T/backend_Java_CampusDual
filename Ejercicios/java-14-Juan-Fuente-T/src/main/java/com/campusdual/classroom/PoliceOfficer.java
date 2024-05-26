package com.campusdual.classroom;

public class PoliceOfficer extends Person {

    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    public String getSquad() {
        return squad;
    }

    @Override
    public StringBuilder getDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.getDetails());
        builder.append(" ");
        builder.append("Su escuadra es ");
        builder.append(this.getSquad());
        builder.append(".");
        System.out.println(builder);
        return builder;
    }
}

