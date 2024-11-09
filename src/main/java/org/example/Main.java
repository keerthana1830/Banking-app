package org.example;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static void softwareDescription() {
        System.out.println("================================");
        System.out.println("BANKING SYSTEM");
        System.out.println("================================");
    }

    private static void options() {
        System.out.println("1. Bank Login");
        System.out.println("2. Customer Login");
        System.out.println("3. Close application");
        System.out.println("Choose options:");
    }

    private static void bankOptions() {
        System.out.println("0. Create Bank Account");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. See Transactions");
        System.out.println("4. Check balance");
        System.out.println("5. Transfer money");
        System.out.println("6. Logout");
        System.out.println("7. Close the application");
        System.out.println("8. Update Bank Account");
        System.out.println("9. Get Customer details");
    }

    private static void onSuccessLogin(Scanner scanner, Bank bank) {
        System.out.println("Successfully LoggedIn");
        while(true) {
            bankOptions();
            int bankChoice = scanner.nextInt();
            scanner.nextLine();
            if (bankChoice == 0) {
                bank.createAccount(scanner);
            }
            if (bankChoice == 1) {
                bank.deposit();
            } else if (bankChoice == 2) {
                bank.withdraw();
            } else if (bankChoice == 3) {
                bank.generateTransactionReport();
            } else if (bankChoice == 4) {
                bank.checkBalance();
            } else if (bankChoice == 5) {
                bank.transfer();
            } else if (bankChoice == 6) {
                break;
            } else if (bankChoice == 7) {
                System.exit(0);
            } else if (bankChoice == 8) {
                bank.updateAccount();
            } else if (bankChoice == 9) {
                String accountNumber = scanner.nextLine();
                System.out.println(bank.fetchCustomerDetails(accountNumber));
            }
        }
    }

    private static void bankLogin(Scanner scanner, Bank bank) {
        System.out.println("Enter username: ");
        scanner.nextLine();
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        boolean isLogInSuccessful = bank.login(username, password);
        if (isLogInSuccessful) {
            onSuccessLogin(scanner, bank);
        }
        else {
            System.out.println("Sorry Wrong username / password");
        }
    }

    public static void main(String[] args) {
        MyConnection connection = new MyConnection();
        Connection databaseConnection = connection.establishConnection();
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        bank.setName("SBI");
        bank.setBranch("CBE");
        bank.setBankType(BankType.PUBLIC_SECTOR);
        bank.setIfscCode("SBI00012");
        bank.setStartShift(LocalDateTime.of(2024, 11,9, 10,  00));
        bank.setEndShift(LocalDateTime.of(2024, 11,9, 16, 00));
        while(true) {
            softwareDescription();
            options();
            int choice = scanner.nextInt();
            if (choice == 1) {
                bankLogin(scanner, bank);
            }
            else if (choice == 2) {

            }
            else {
                break;
            }
        }
    }

}