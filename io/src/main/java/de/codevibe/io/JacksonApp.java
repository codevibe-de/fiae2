package de.codevibe.io;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JacksonApp {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Book> books = List.of(
                new Book("123-3345", "Blah", 4, 8.99f, true),
                new Book("123-3345", "Blah", 4, 8.99f, true)
        );
        String json = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(books);
        System.out.println(json);

        TypeReference<List<Book>> booksListTypeRef = new TypeReference<>() {
        };
        List<Book> books1 = mapper.readValue(json, booksListTypeRef);

        // File.listFiles() -- alle Dateien in einem Ordner
        // ObjectMapper.readValue() -- pro Datei eine Java Instanz erzeugen
    }
}


class Book {
    private String isbn;
    private String title;
    private int edition;
    private float price;
    private boolean bestseller;

    @JsonCreator
    public Book(
            @JsonProperty("isbn") String isbn,
            @JsonProperty("title") String title,
            @JsonProperty("edition") int edition,
            @JsonProperty("price") float price,
            @JsonProperty("bestseller") boolean bestseller
    ) {
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.price = price;
        this.bestseller = bestseller;
    }

    public int getEdition() {
        return edition;
    }

    public float getPrice() {
        return price;
    }

    public boolean isBestseller() {
        return bestseller;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

}