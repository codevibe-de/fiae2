package de.codevibe;

import de.codevibe.library.Book;
import de.codevibe.library.Library;
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
    void isAvailable() {
        assertTrue(library.isAvailable("123"));
        assertTrue(library.isAvailable("456"));
        assertTrue(library.isAvailable("789"));
        assertFalse(library.isAvailable("111"));
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
    void addSameBook() {
        library.addBook(book1);
        assertEquals(4, library.getBookCount());
    }

}
