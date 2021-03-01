package com.alsarraa.projects.googleBooksApi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "googlebooks")
public class GoogleBooks {

    @Id
    private String id;

    private String bookName;

    private String isbn;

    public GoogleBooks() {}

    public GoogleBooks(String id, String bookName, String isbn) {
        this.id = id;
        this.bookName = bookName;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
