package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Bank implements CustomerOperation {
    private List<Customer> customerList;
    private String ifscCode;
    private String branch;
    private String name;
    private LocalDateTime startShift;
    private LocalDateTime endShift;
    private BankType bankType;
    private String password = "SBI@123";
    private String username;

    public void setName(String name) {
        this.name = name;
        this.username = name;
    }

    public void setBankType(BankType bankType) {
        this.bankType = bankType;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void createAccount() {

    }
    public void blockAccount() {

    }
    public void updateAccount() {

    }
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

    public void deposit() {

    }
    public void withdraw() {

    }
}
