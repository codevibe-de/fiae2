package de.codevibe.library;

public class BookNotAvailableException extends RuntimeException {

    public BookNotAvailableException() {
        this("Book not available");
//        super("Book not available");
    }

    public BookNotAvailableException(String message) {
        super(message);
        System.out.println("Creating new BookNotAvailableException instance");
    }

}
