package com.example.bankapp.entities.enums;

public enum TransactionType {
    NEW("NEW"),
    PENDING("PENDING"),
    APPROWED("APPROWED");
    private final String value;
    TransactionType(String value) {this.value=value;}
    public String getValue() {return value;}
}
