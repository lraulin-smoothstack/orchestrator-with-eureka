package com.smoothstack.december.orchestrationservice.entity;

import java.time.LocalDate;;

public class BookLoan {
    
    private int bookId;
    private int branchId;
    private int cardNumber;
    private LocalDate dateOut;
    private LocalDate dueDate;
    private LocalDate dateIn;
    private Borrower borrower;
    private LibraryBranch branch;
    
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
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public LocalDate getDateOut() {
        return dateOut;
    }
    
    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    public LocalDate getDateIn() {
        return dateIn;
    }
    
    public void setDateIn(LocalDate dateIn) {
        this.dateIn = dateIn;
    }
    
    public Borrower getBorrower() {
        return borrower;
    }
    
    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
    
    public LibraryBranch getBranch() {
        return branch;
    }
    
    public void setBranch(LibraryBranch branch) {
        this.branch = branch;
    }
    
}