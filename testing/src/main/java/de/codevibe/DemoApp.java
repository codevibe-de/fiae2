package de.codevibe;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;

public class DemoApp {

    public static void main(String[] args) {
        String s = "Ich bin ein sehr laaaaanger Text!!!";
        String s2 = "Ich bin ein java Fan";
        String iban = "DE1001984453422";
        String k = StringUtils.abbreviate(s, 13);
        System.out.println(k);
        // Wie viele Leerzeichen hat der Text?
        System.out.println(StringUtils.countMatches(s, " "));
        // String als CamelCase Abfolge speichern.
        System.out.println(CaseUtils.toCamelCase(s2, false, ' '));
        System.out.println("Startet die IBAN " + iban + " mit DE?" + StringUtils.startsWithIgnoreCase(iban, "DE"));

        String prod = "56;Silberelfenohren;850";
        String[] prodItems = StringUtils.split(prod, ";");
        Product1 p = new Product1(prodItems[0],  prodItems[1], prodItems[2]);
        System.out.println(p);
        String prod1 = "12;Mandragora;26";
        Product1 p1 = new Product1(prod1);
        System.out.println(p1);

        String text = "Gold-TrX";
        System.out.println(strukturBestimung(text));

    }

    private static boolean strukturBestimung(String text) {

        if (text.length() < 11 && text.length() > 0 && text.endsWith("X") && text.contains("-")) return true;
        else return false;
    }

}

class Product1 {
    private int id;
    private String name;
    private double price;

    public Product1(String id, String name, String price) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.price = Double.parseDouble(price);
    }
    public Product1(String p){
        String[] split = p.split(";");
        this.id = Integer.parseInt(split[0]);
        this.name = split[1];
        this.price = Double.parseDouble(split[2]);
    }

    public String toString(){
        return "ProduktID: " + id + ", Name: " + name + ", Preis: " + price;
    }
}
