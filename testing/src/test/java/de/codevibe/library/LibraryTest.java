package de.codevibe.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
    
    private Library lib;

    @BeforeEach
    void setUp() {
        lib = new Library();
    }

    @Test
    void addBook() {
        lib.addBook(new Book(null, null, null));
    }

    @Test
    void borrowBook() {
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