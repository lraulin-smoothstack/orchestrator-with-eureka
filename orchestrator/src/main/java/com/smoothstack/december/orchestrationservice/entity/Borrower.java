package com.smoothstack.december.orchestrationservice.entity;

public class Borrower {

    private int cardNumber;
    private String name;
    private String address;
    private String phoneNumber;
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
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
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}