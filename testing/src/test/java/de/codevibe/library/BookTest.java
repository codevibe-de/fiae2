package de.codevibe.library;

import de.codevibe.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private  Book book;
    @BeforeEach
    void setUp() {
        book = new Book("987654", "I Lied And My Pants Are Not On Fire", "Joe Shmoe");
    }
    @Test
    void getIsbn() {
        assertEquals("987654", book.getIsbn());
    }

    @Test
    void getTitle() {
        assertEquals("I Lied And My Pants Are Not On Fire", book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("Joe Shmoe", book.getAuthor());
    }

    @Test
    void testEquals() {
        assertTrue(book.equals(book));
        assertFalse(book.equals(null));
        assertFalse(book.equals(new Book("54321", "Do Yappies Dream Of The Big Short?", "Rainer Zufall")));
    }

    @Test
    void testHashCode() {
        int hash = Objects.hash(book.getTitle());
        assertEquals(book.hashCode(), hash);

        int hash1 = Objects.hash("There Is A Broker In My Basement, And I Like It.");
        assertNotEquals(book.hashCode(), hash1);

    }
}