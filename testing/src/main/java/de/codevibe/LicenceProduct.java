package main.java.de.codevibe;

public class LicenceProduct extends de.codevibe.Product {
    private float costPerUser;

    public LicenceProduct(long id, String name, float costPerUser) {
        super(id,name);
        this.costPerUser = costPerUser;
    }
}
