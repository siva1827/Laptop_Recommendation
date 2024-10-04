package com.example.Laptop_Recommendation.exception;

public class LaptopNotFoundException extends Exception {
    private final String message;
    public LaptopNotFoundException(String msg) {
        super(msg);
        this.message=msg;
    }
}