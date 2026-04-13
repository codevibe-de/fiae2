package main.java.de.codevibe.io;

import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JacksonApp {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Book book = new Book("123-3345", "Blah");
        String json = mapper.writeValueAsString(book);
        System.out.println(json);
        File file = new File("io/src/main/java/de/codevibe/io/Book/book.json");
        file.createNewFile();
        file.mkdir();
        Files.write(file.toPath(), json.getBytes());
//        File file2 = new File("Book");
//        file2.mkdir();

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