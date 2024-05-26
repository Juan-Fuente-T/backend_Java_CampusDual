package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	@Override
	public StringBuilder getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append(super.getDetails());
		builder.append(" ");
		builder.append("Su área es ");
		builder.append(this.getArea());
		builder.append(".");
		System.out.println(builder);
		return builder;
	}

}
