package org.example;

import java.util.ArrayList;
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
    private List<Account> accounts = new ArrayList<>();

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTotalCashback() {
        return totalCashback;
    }

    public void setTotalCashback(long totalCashback) {
        this.totalCashback = totalCashback;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(String guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
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
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", panCard='" + panCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", totalCashback=" + totalCashback +
                ", address='" + address + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", guardianPhoneNumber='" + guardianPhoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
