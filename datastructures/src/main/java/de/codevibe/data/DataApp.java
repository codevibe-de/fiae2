package de.codevibe.data;

public class DataApp {

    public static void main(String[] args) {

        Pair<String> p1 = new Pair<String>("123xy", "Protonenkanone");
        Pair<Integer> n1 = new Pair(3, 5);

        var summe = n1.getLeft() + n1.getRight();
        System.out.println(summe);

    }
}
