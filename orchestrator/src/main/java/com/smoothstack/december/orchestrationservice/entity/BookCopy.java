package com.smoothstack.december.orchestrationservice.entity;

import java.util.List;

public class BookCopy {

    private int bookId;
    private int branchId;
    private int amount;
    private Book book;
    private List<LibraryBranch> branches;
    
    public int getBookId() {
        return bookId;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public int getBranchId() {
        return branchId;
    }
    
    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public Book getBook() {
        return book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    
    public List<LibraryBranch> getBranches() {
        return branches;
    }
    
    public void setBranches(List<LibraryBranch> branches) {
        this.branches = branches;
    }
    
}