package de.codevibe.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
         book = new Book("1234", "Der Herr der Ringe", "King Charles");
        book1 = new Book("5567","Der Herr der Ringe", "Richard");
        book2 = new Book("4567","Der Herr der Ringe", "Richard");
        book3 = new Book("1289", "Harry Potter", "JKR");

    }

    @Test
    void getIsbnReturnIsbn() {
        assertEquals("1234", book.getIsbn());
        assertNotEquals("666", book1.getIsbn());
        assertNotEquals("", book2.getIsbn());
        assertNotEquals(1234, book3.getIsbn());
        assertNotNull(book.getIsbn());
    }

    @Test
    void getTitle() {
        assertEquals("Der Herr der Ringe", book.getTitle());
        assertNotEquals("King Charles", book1.getTitle());
        assertNotEquals("", book2.getTitle());
        assertNotEquals(1234, book3.getTitle());
        assertNotNull(book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("King Charles", book.getAuthor());
        assertNotEquals("Der Herr der Ringe", book1.getAuthor());
        assertNotEquals("Der Herr der Ringe", book2.getAuthor());
        assertNotEquals("Der Herr der Ringe", book3.getAuthor());
        assertNotNull(book.getAuthor());
        assertNotEquals(1234, book3.getAuthor());
        assertNotEquals("",book.getAuthor());
    }

    @Test
    void testEquals() {

        book1 = new Book("5678","Der Herr der Ringe", "Richard");
        book2 = new Book("4567","Der Herr der Ringe", "Richard");
        book3 = new Book("1289", "Harry Potter", "JKR");

        // sind beide gleich
        assertTrue(book1.equals(book2));

        // sind nicht gleich
        assertFalse(book1.equals(book3));

        // book 1 ist auch book1 also gleich
        assertTrue(book1.equals(book1));

        // null prüfen
        assertFalse(book1.equals(null));

        // typ prüfen ob passt
        assertFalse(book1.equals("Irgendein String"));

    }

    @Test
    void testHashCode() {

        //gleiche titel also hashcode muss gleich sein
        assertEquals(book1.hashCode(), book2.hashCode());

        //unterschiedliche titel also hashcode unterschiedlich
        //(außnahme kann gleich sein aber unwahrscheinlich)
        assertNotEquals(book1.hashCode(), book3.hashCode());
    }


    @Test
    void testEqualsAndHashCodeTogether() {

        assertEquals(book1, book2);
        assertEquals(book1.hashCode(), book2.hashCode());
    }

}