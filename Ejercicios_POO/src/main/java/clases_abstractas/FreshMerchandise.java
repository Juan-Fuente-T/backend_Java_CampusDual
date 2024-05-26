package main.java.clases_abstractas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    protected Date expirationDate;

    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date expirationDate) {
        //super(name, uniqueId, responsibleId);
        this.expirationDate = expirationDate;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        //super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
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

    public static void main(String[] args) {
        FreshMerchandise fm = new FreshMerchandise("Manzanas", "001-9", "Frutería de ayer S.L.",
                8, "C", "114D", 53, Calendar.getInstance().getTime());
        System.out.println(fm.getSpecificData());
    }
}
