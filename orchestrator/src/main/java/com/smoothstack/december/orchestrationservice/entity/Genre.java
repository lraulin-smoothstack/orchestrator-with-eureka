package com.smoothstack.december.orchestrationservice.entity;

import java.util.List;

public class Genre {
    
    private int genreId;
    private String name;
    private List<Book> books;
    
    public int getGenreId() {
        return genreId;
    }
    
    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
