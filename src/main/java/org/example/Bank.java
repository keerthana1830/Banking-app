package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank implements CustomerOperation {
    private List<Customer> customerList = new ArrayList<>();
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

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartShift() {
        return startShift;
    }

    public void setStartShift(LocalDateTime startShift) {
        this.startShift = startShift;
    }

    public LocalDateTime getEndShift() {
        return endShift;
    }

    public void setEndShift(LocalDateTime endShift) {
        this.endShift = endShift;
    }

    public BankType getBankType() {
        return bankType;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBankType(BankType bankType) {
        this.bankType = bankType;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void createAccount(Scanner scanner) {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Aadhar number: ");
        String aadharNumber = scanner.nextLine();
        System.out.println("Enter PAN number: ");
        String panNumber = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter user password");
        String password = scanner.nextLine();


        // Create Customer
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAadhaarNumber(aadharNumber);
        customer.setPanCard(panNumber);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        customer.setPassword(password);

        // Create Account
        Account account = new Account();
        account.setBalance(1000);
        account.setType(AccountType.SAVINGS);
        account.setAccountNumber(firstName+lastName+panNumber);

        // bind accoun to customer
        customer.getAccounts().add(account);

        this.customerList.add(customer);
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
    public boolean login(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public void deposit() {

    }
    public void withdraw() {

    }
}
