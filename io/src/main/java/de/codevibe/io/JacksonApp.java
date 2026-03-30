package de.codevibe.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import tools.jackson.databind.ObjectMapper;

public class JacksonApp {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Book book = new Book("123-3345", "Blah");
        Book book1 = new Book("123-4323", "Book 1");

        List<Book> books = List.of(book, book1);
        String json = mapper.writeValueAsString(books);
        //System.out.println(json);

        File directoryPath = new File("C:\\Data\\Library\\Books\\");
        File file = new File("books.json");

        String prettyJson = WriterApp.prettify(json);
        WriterApp.writer(directoryPath, file, prettyJson, false);

        
        books = ReaderApp.reader(directoryPath, file);
        System.out.println(books);
    }
}


class Book {
    private String isbn;
    private String title;

    public Book() {
        // benötigt für Jackson beim Laden
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}