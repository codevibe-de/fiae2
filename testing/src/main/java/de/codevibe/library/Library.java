package main.java.de.codevibe.library;

import java.util.*;

public class Library {

    private final Map<String, Book> books = new HashMap<>();

    private final Set<String> borrowedIsbns = new HashSet<>();

    public void addBook(Book book) {
        bookExists(book);
        books.put(book.getIsbn(), book);
    }


    public void borrowBook(String isbn) {
        if (!books.containsKey(isbn)) {
            return;
        }
        borrowedIsbns.add(isbn);
    }


    public void returnBook(String isbn) {
        borrowedIsbns.remove(isbn);
    }

    public boolean bookExists(String isbn) {
        return books.containsKey(isbn);
    }
    public void bookExists(Book book) {
        if(books.containsKey(book.getIsbn())) throw new BookAlreadyExistsException("Book already exists");
    }
    public boolean isAvailable(String isbn) {
        checkBookExists(isbn);
        return !borrowedIsbns.contains(isbn);
    }


    public int getBookCount() {
        return books.size();
    }


    public int getBorrowedCount() {
        return borrowedIsbns.size();
    }


    public Collection<Book> getAllBooks() {
        return books.values();
    }

    /**
     * Checks if a book with the given ISBN does exist in this library.
     * @throws BookNotAvailableException if it doesn't exist
     */
    private void checkBookExists(String isbn) {
        if (!books.containsKey(isbn)) {
            throw new BookNotAvailableException("Sorry, book with ISBN " + isbn + " doesn't exist");
        }
    }
}
