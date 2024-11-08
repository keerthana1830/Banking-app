package org.example;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        bank.setName("SBI");
        bank.setBranch("CBE");
        bank.setBankType(BankType.PUBLIC_SECTOR);
        while(true) {
            softwareDescription();
            options();
            int choice = scanner.nextInt();
            if (choice == 1) {

            }
            else if (choice == 2) {

            }
            else {
                break;
            }
        }
    }

}