package org.example;

import java.util.List;

public class Customer implements CustomerOperation {
    private String aadhaarNumber;
    private String firstName;
    private String lastName;
    private String panCard;
    private String phoneNumber;
    private String email;
    private long totalCashback;
    private String address;
    private String guardianName;
    private String guardianPhoneNumber;
    private String password;
    private List<Account> accounts;

    @Override
    public void transfer() {

    }

    @Override
    public void generateTransactionReport() {

    }

    @Override
    public void checkBalance() {

    }

    @Override
    public void login() {

    }
}
