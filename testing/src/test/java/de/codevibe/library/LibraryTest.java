<<<<<<<< HEAD:testing/src/test/java/de/codevibe/LibraryTest.java
package test.java.de.codevibe;

import main.java.de.codevibe.library.Book;
import main.java.de.codevibe.library.BookNotAvailableException;
import main.java.de.codevibe.library.Library;
========
package de.codevibe.library;

>>>>>>>> 7142c37 (sltn: added datastructures module):testing/src/test/java/de/codevibe/library/LibraryTest.java
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        book1 = new Book("123", "haha", "JRR T.");
        book2 = new Book("456", "hehe", "JRR T.");
        book3 = new Book("789", "hihi", "JRR T.");
        library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }


    @Test
    @Order(1)
    void getBookCount() {
        assertEquals(3, library.getBookCount());
    }

    @Test
    @Order(2)
    void addBook() {
        library.addBook(new Book("999", "haha", "JRR T."));
        assertEquals(4, library.getBookCount());
    }


    @Test
    @Order(3)
    void isAvailable__succeeds() {
        assertTrue(library.isAvailable("123"));
        assertTrue(library.isAvailable("456"));
        assertTrue(library.isAvailable("789"));
    }

    @Test
    @Order(3)
    void isAvailable__failsForMissingBook() {
        try {
            library.isAvailable("111");
            Assertions.fail("We should have raised an exception");
        }
        catch (BookNotAvailableException e) {
            // empty by design -- we expect an exception to be thrown
        }
    }


    @Test
    @Order(4)
    void getBorrowedCount() {
        assertEquals(0, library.getBorrowedCount());
    }



    @Test
    @Order(5)
    void borrowBook() {
        library.borrowBook("123");
        assertEquals(1, library.getBorrowedCount());
        library.borrowBook("456");
        assertEquals(2, library.getBorrowedCount());
    }

    @Test
    @Order(6)
    void borrowBooknotAvailable() {
        library.borrowBook("123");
        library.borrowBook("456");
        assertEquals(2, library.getBorrowedCount());
        library.borrowBook("123");
        assertEquals(2, library.getBorrowedCount());
    }

    @Test
    @Order(7)
    void returnBook() {
        library.borrowBook("123");
        assertEquals(1, library.getBorrowedCount());
        library.returnBook("123");
        assertEquals(0, library.getBorrowedCount());
    }

    @Test
    @Order(8)
    void returnBookNotBorrowed() {
        library.returnBook("123");
        assertEquals(0, library.getBorrowedCount());
    }

    @Test
    @Order(9)
    void returnBooknotFromLibrary() {
        library.returnBook("999");
        assertEquals(0, library.getBorrowedCount());
    }


    @Test
    @Order(10)
    void addBook__failsSinceBookAlreadyExists() {
        library.addBook(book1);
        assertEquals(4, library.getBookCount());
    }


    @Test
    void getBorrowPrice__blackBox() {
        float actual = library.getBorrowPrice(18, false);
        assertEquals(1.00f, actual);
    }

    @Test
    void getBorrowPrice__queryCountWorks() {
        long countBefore = library.priceQueryCount;
        library.getBorrowPrice(18, true);
        long countAfter = library.priceQueryCount;
        assertEquals(countBefore + 1, countAfter);
    }

}
