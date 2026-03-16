package de.codevibe;

public class Pair {

    private String left, right;

    public Pair(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public void extractIdAndName(){
        System.out.println("Extracted Id :" + getLeft() + "\nExtracted Name :" + getRight());
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

}
