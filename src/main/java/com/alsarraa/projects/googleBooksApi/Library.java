package com.alsarraa.projects.googleBooksApi;

import java.util.List;

public class Library extends GoogleBooks {

    private List<Item> items;

    public Library() {}

    public Library(List<Item> items) {
        this.items = items;
    }

    public Library(String id, String bookName, String isbn, List<Item> items) {
        super(id, bookName, isbn);
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
