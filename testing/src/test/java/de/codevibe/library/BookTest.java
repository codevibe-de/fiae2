package de.codevibe.library;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("978-3-16-148410-0", "Buch Titel", "Harald Bauer Oder so?");
    }

    @Test
    void getIsbn() {
        assertEquals("978-3-16-148410-0", book.getIsbn());
    }

    @Test
    void getTitle() {
        assertEquals("Buch Titel", book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("Harald Bauer Oder so?", book.getAuthor());
    }

    @Test
    void testEquals() {
        assertEquals(true, book.equals(book));
        assertEquals(false, book.equals(new ArrayList<>()));
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash("Buch Titel"), book.hashCode());
    }
}
