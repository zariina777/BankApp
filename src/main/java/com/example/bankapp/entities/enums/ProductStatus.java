package com.example.bankapp.entities.enums;

public enum ProductStatus {
    ACTIVE("ACTIVE"),
    PENDING("PENDING"),
    REMOVED("REMOVED");
    private final String value;
    ProductStatus(String value) {this.value=value;}
    public String getValue() {return value;}
}
