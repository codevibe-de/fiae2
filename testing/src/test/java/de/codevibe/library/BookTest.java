package de.codevibe.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookTest {
    private Book book;
    @BeforeEach
    void setUp() {
        book = new Book("458975", "Lord of the Rings", "John Tolkin" );
    }

    @Test
    void getIsbn() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void getAuthor() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}