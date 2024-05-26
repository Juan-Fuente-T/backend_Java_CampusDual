package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    protected Date expirationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area,
                            String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(this.getLocation());
        builder.append("\n");
        builder.append("Caducidad: ");
        builder.append(sdf.format(this.getExpirationDate()));
        return builder.toString();
    }
    public String getFormattedDate(Date expirationDate) {
        return sdf.format(expirationDate);
    }

    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }
}
