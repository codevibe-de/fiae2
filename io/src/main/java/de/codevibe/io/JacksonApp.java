package de.codevibe.io;

import tools.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JacksonApp {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Book book = new Book("123-3345", "Blah");
        Book book2 = new Book("123-3345", "Blaha");

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);

        File file = new File("./io/book.json");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        mapper.writerWithDefaultPrettyPrinter().writeValue(file, books);

        ArrayList<Book> bookz = mapper.readValue(file, ArrayList.class);

        for(Book b : bookz){
            System.out.println(b.getTitle());
        }




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

    public int getEdition(){
        return 4;
    }

}