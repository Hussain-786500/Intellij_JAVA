package com.secondOopsjava;

import java.util.Scanner;

//    ---- create a class (Blueprint) ----
class BankAccount {

    //   ---- data initialize ----
    private double balance = 50000;

    //      --------- getter ---------
    public double getBalance() {
        return balance;
    }

    //     --- deposit ----
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        System.out.println("Amount deposit successfully *");
    }

    //    ---- withdraw ----
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else {
            balance -= amount;
            System.out.println("Pleas collect your cash*");
        }
    }
    //    ----- Private Authentication Logic -----
    private boolean validate(String userName, String Password) {
        return userName.equals("alphaGo") && Password.equals("1234");
    }

//    ----- public access point safe -----
    public boolean login(String userName, String Password){
        return validate(userName, Password);
    }
}

    //    ----- Main Class -----
    public class AccountEncapsulation {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            BankAccount acc = new BankAccount();

            System.out.print("Enter UserName: ");
            String user = sc.next();

            System.out.print("Enter Password: ");
            String pass = sc.next();

            if (!acc.login(user, pass)) {
                System.out.println(" Invalid Username or Password");
                return;
            }

            System.out.println("Login Successfully ");
            System.out.println("Current Balance: " + acc.getBalance());

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            if (choice == 1) {
                acc.deposit(amount);
            } else if (choice == 2) {
                acc.withdraw(amount);
            } else {
                System.out.println("Invalid Option: ");
            }
            System.out.println("Final Balance: " + acc.getBalance());
            sc.close();
        }
    }
