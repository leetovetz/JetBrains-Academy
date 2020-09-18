package com.company;

public class Bank {

    public static void transfer(Account account1, Account account2, double amount) {

        if (account1.getCountOfMoney() < amount) {
            System.out.println("Not enough money");
        } else {
            if (amount > 0) {
                account2.setCountOfAddedMoney(amount);
                account1.setCountOfRemovedMoney(amount);
            } else {
                System.out.println("Amount of transfer is negative, ERROR!");
            }

        }
    }
}