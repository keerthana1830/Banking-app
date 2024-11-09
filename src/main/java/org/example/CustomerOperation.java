package org.example;

public interface CustomerOperation {
    void transfer();
    void generateTransactionReport();
    void checkBalance();
    boolean login(String username, String password);
}
