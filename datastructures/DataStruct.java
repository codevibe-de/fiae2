package fiae2.datastructures;

import org.junit.platform.commons.util.StringUtils;

public class DataStruct {
    public record PairB (String leftValue, String rightValue) {}
    static void main() {
        PairB p= extractIDandName("123 Tom");
        System.out.println(p.leftValue);
        System.out.println(p.rightValue);
    }

    private static PairB extractIDandName(String s) {
        String[] parts = s.split(" ");
        return new PairB(parts[0], parts[1]);
    }
}
