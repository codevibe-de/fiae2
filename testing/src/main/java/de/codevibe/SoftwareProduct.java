package main.java.de.codevibe;

public class SoftwareProduct extends de.codevibe.Product {
    private long downloadSize;

    public SoftwareProduct(long id, String name, long downloadSize) {
        super(id, name);
        this.downloadSize = downloadSize;
    }
}
