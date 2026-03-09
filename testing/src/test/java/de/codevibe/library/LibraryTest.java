package de.codevibe.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    private Book book(String isbn, String title, String author) {
        return new Book(isbn, title, author);
    }

    @Test
    void addBook() {

        assertEquals(0, library.getBookCount());

        Book b1 = book("ISBN-1", "A", "teeest");
        Book b2 = book("", "", "teeest");
        library.addBook(b1);
        assertEquals(1, library.getBookCount());
        library.addBook(b2);
        assertEquals(2, library.getBookCount());

        Collection<Book> all = library.getAllBooks();
        assertTrue(all.contains(b1));
        assertTrue(all.contains(b2));
    }

    @Test
    void borrowBook() {
        assertEquals(0, library.getBookCount());

    }

    @Test
    void returnBook() {
    }

    @Test
    void isAvailable() {
    }

    @Test
    void getBookCount() {
    }

    @Test
    void getBorrowedCount() {
    }

    @Test
    void getAllBooks() {
    }
}