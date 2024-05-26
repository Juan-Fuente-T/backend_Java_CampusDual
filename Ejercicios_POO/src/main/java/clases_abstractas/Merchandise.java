package main.java.clases_abstractas;

public abstract class Merchandise {
    protected String name;
    protected String uniqueId;
    protected String responsibleId;
    protected int zone;
    protected String area;
    protected String shelf;
    protected int quantity;


//  public Merchandise(String name, String uniqueId, String responsibleId) {
//    this.name = name;
//    this.uniqueId = uniqueId;
//    this.responsibleId = responsibleId;
//  }
//
//  public Merchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
//      int quantity) {
//    this.name = name;
//    this.uniqueId = uniqueId;
//    this.responsibleId = responsibleId;
//    this.zone = zone;
//    this.area = area;
//    this.shelf = shelf;
//    this.quantity = quantity;
//  }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getResponsibleId() {
        return this.responsibleId;
    }

    public void setResponsibleId(String responsibleId) {
        this.responsibleId = responsibleId;
    }

    public int getZone() {
        return this.zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        StringBuilder builder = new StringBuilder();
        builder.append("Z - ");
        builder.append(getZone());
        builder.append(" A - ");
        builder.append(getArea());
        builder.append(" E - ");
        builder.append(getShelf());
        return builder.toString();
    }

    public abstract Object getSpecificData();
}
