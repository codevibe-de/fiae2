package de.codevibe.data.generics;

public class Box<T> {

    private T value;

    public void put(T o) {
        this.value = o;
    }

    public T get() {
        return value;
    }

}
