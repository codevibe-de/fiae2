package de.codevibe.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library = new Library();
    @Test
    void addBook() {
        Book book = new Book("12345", "Buy High, Sell Low.", "Rainer Winkler");
        library.addBook(book);
        for (Book book1 : library.getAllBooks()) {
            if (book.getIsbn().equals(book1.getIsbn())) {
                assertEquals(book.getIsbn(), book1.getIsbn());
            }
        }

    }

    @Test
    void borrowBook() {
        Book book = new Book("12345", "Buy High, Sell Low.", "Rainer Winkler");
        library.addBook(book);
        library.borrowBook("12345");
        assertFalse(library.isAvailable("12345"));
        assertTrue(Exception,library.addBook(null));
    }

    @Test
    void returnBook() {
        library.returnBook("12345");
        assertTrue(library.isAvailable("12345"));
        assertFalse(library.isAvailable("13579"));

    }

    @Test
    void isAvailable() {
        assertTrue(library.isAvailable("12345"));
    }

    @Test
    void getBookCount() {
        library.addBook(new Book("54321", "Do Yappies Dream Of The Big Short?", "Rainer Zufall"));
        assertEquals(1, library.getBookCount());
    }

    @Test
    void getBorrowedCount() {
        assertEquals(0, library.getBorrowedCount());
    }

    @Test
    void getAllBooks() {
        library.addBook(new Book("67889", "Big Fish, Small Fish", "Spandax Dad"));
        library.addBook(new Book("78905", "Where Is My Money!?", "Spandax Dad"));
        int size = library.getAllBooks().size();
        assertEquals(2, size);
    }
}