package main.java.de.codevibe.library;

import java.util.*;

public class Library {

    private final Map<String, Book> books = new HashMap<>();
    private final Set<String> borrowedIsbns = new HashSet<>();
    long priceQueryCount = 0;

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
     *
     * @throws BookNotAvailableException if it doesn't exist
     */
    private void checkBookExists(String isbn) {
        if (!books.containsKey(isbn)) {
            throw new BookNotAvailableException("Sorry, book with ISBN " + isbn + " doesn't exist");
        }
    }


    /**
     * Returns the default price of 2.50, but if younger than 18 years only 1.00 €. Students benefit from a discount of 50 cnt.
     *
     * @return
     */
    public float getBorrowPrice(int age, boolean isStudent) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is less than 0");
        }

        // for internal tracking, count number of queries
        priceQueryCount++;

        // business logic:
        final float defaultPrice = 2.50f;
        if (age < 18) {
            return 1.00f;
        } else if (isStudent) {
            return defaultPrice - 0.50f;
        } else {
            return defaultPrice;
        }
    }
}
