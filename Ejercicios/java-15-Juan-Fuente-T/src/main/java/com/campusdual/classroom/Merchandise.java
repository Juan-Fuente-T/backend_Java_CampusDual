package com.campusdual.classroom;

public abstract class Merchandise {

	protected String name;
	protected String uniqueId;
	protected String responsibleId;
	protected int zone;
	protected String area;
	protected String shelf;
	protected int quantity;

	public Merchandise(String name, String uniqueId, String responsibleId) {
		this.name = name;
		this.uniqueId = uniqueId;
		this.responsibleId = responsibleId;
	}

	public Merchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
			int quantity) {
		this.name = name;
		this.uniqueId = uniqueId;
		this.responsibleId = responsibleId;
		this.zone = zone;
		this.area = area;
		this.shelf = shelf;
		this.quantity = quantity;
	}

	public String getLocation() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zone - ");
		builder.append(getZone());
		builder.append(" Area - ");
		builder.append(getArea());
		builder.append(" Shelf - ");
		builder.append(getShelf());
		builder.append(" Quantity - ");
		builder.append(getQuantity());
		return builder.toString();
	}

	public abstract Object getSpecificData();

	public int getZone() {
		return zone;
	}

	public String getArea() {
		return area;
	}


	public String getShelf() {
		return shelf;
	}


	public int getQuantity() {
		return quantity;
	}

}
