package de.codevibe;

public class LicenceProduct extends Product{
    private final float costPerUser;

    public LicenceProduct(long id, String name, float costPerUser) {
        super(id, name);
        this.costPerUser = costPerUser;
    }
}
