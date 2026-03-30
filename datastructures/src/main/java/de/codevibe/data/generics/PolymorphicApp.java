package de.codevibe.data.generics;

import de.codevibe.data.model.*;

import java.security.DigestException;
import java.util.ArrayList;
import java.util.List;

public class PolymorphicApp {

    public static void main(String[] args) {
        Cat c = new Cat();
        Shark s = new Shark();
        Mammal x = doSomething(c, c);
        Cat c2 = doSomething2(c, c);
    }


    public static Mammal doSomething(Mammal value, Mammal otherValues) {
        return value;
    }

    public static <T extends Cat> T doSomething2(T value, T otherValues) {
        value.meauw();
        return value;
    }

}
