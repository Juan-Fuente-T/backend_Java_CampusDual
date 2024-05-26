package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public StringBuilder getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append("Se trata de la persona llamada ");
		builder.append(this.getName());
		builder.append(" ");
		builder.append(this.getSurname());
		builder.append(".");
		return builder;
	}
}//tiene sentido usar SringBuilder sin un return?
