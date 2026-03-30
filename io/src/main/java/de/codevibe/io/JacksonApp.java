package de.codevibe.io;

import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class JacksonApp {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Book book = new Book("123-3345", "Blah");
        Book book2 = new Book("125-6645", "BlahBlah");
        String json = mapper.writeValueAsString(book);
        System.out.println(json);

        book.bookJsonSave("C:\\Data\\Library", "book.json");
        book2.bookJsonSave("C:\\Data\\Library", "book.json");
        //book.bookJsonLoad("C:\\Data\\Library", "book.json");


    }
}


class Book {
    private String isbn;
    private String title;

    public void bookJsonSave(String directory, String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
    // Datei und den Dateinamen erzeugen
        File output = new File(directory, filename);
    //Ordner anlegen falls noch nicht vorhanden
        output.getParentFile().mkdirs();
    //Output wird jetzt gespeichert
        mapper.writeValue(output, this);
    //Ausgabe bestätigen
        System.out.println("Book.json wurde gespeichert! " + output.getAbsolutePath());
    }

    public void bookJsonLoad(String directory, String filename) throws IOException {
        File file = new File(directory, filename);
    //Lesen und Encoden der Datei
        String json = Files.readString(file.toPath(), StandardCharsets.UTF_8);
    //Ausgabe bestätigen
        System.out.println("Hier ist dein JSON" + json);
    }

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