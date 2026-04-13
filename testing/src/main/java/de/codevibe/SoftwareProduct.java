package de.codevibe;

public class SoftwareProduct extends Product {
    private final long downloadSize;


    public SoftwareProduct(long id, String name, long downloadSize) {
        super(id, name);
        this.downloadSize = downloadSize;
    }
}
