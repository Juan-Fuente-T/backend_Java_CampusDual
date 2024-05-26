package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}
	public String getSpecialization() {
		return specialization;
	}

	@Override
	public StringBuilder getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append(super.getDetails());
		builder.append(" ");
		builder.append("Su especialización es ");
		builder.append(this.getSpecialization());
		builder.append(".");
		System.out.println(builder);
		return builder;
	}
}
