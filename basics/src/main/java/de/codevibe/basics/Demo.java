package de.codevibe.basics;

public class Demo {

    public static void main(String[] args) {
        new Tralala();
    }
}


// - hier könnte ich Attribute und konkrete Methoden schreiben, die nach unten vererbt werden
abstract class X {
    String data;
    abstract void foo1();
}

// - hier keine Attribute, die nach unten vererbt werden könnten
// - Interface = Vertrag
abstract interface Y {
    abstract void foo2();
}
abstract interface Z {
    abstract void foo3();
}



class Tralala extends X implements Y, Z {

    @Override
    void foo1() {
        this.data;
    }

    @Override
    public void foo2() {
    }

}