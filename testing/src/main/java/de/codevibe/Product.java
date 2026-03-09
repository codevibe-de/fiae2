package de.codevibe;

//lege Klasse "Product" an (mit id und name und price) und lese einen Test aus, wie
// "123;Pangalaktischer Donnergurgler;12.99" der die Teile extrahiert und eine Produktinstanz anlegt

import org.apache.commons.lang3.StringUtils;

public class Product {

    private int id;
    private String name;
    private double price;
    String line = "123;Pangalaktischer Donnergurgler;12.99";

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



}

