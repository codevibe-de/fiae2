package fiae2.datastructures;

public class Pair {
    private String leftValue;
    private String rightValue;

    public Pair(String leftValue, String rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public String getLeft() { return leftValue; }
    public String getRight() { return rightValue; }
}
