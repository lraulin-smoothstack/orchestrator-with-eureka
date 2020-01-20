package com.smoothstack.december.orchestrationservice.entity;

import java.util.List;

public class LibraryBranch {

    private int branchId;
    private String name;
    private String address;
    private List<BookCopy> bookCopies;
    private List<BookLoan> bookLoans;
    
    public int getBranchId() {
        return branchId;
    }
    
    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public List<BookCopy> getBookCopies() {
        return bookCopies;
    }
    
    public void setBookCopies(List<BookCopy> bookCopies) {
        this.bookCopies = bookCopies;
    }

    public List<BookLoan> getBookLoans() {
        return bookLoans;
    }

    public void setBookLoans(List<BookLoan> bookLoans) {
        this.bookLoans = bookLoans;
    }
    
}