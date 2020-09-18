/*
 * Task. 
The bank class has a transfer method (Account1, Account2, amount ). This method transfers 
a positive amount of money from account 1 to account 2. 
Write the implementation of this method. 
 */


package com.company;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(800);
        Account account2 = new Account(500);

        System.out.println("Client 1: " + account1.getCountOfMoney());
        System.out.println("Client 2: " + account2.getCountOfMoney());

        Bank.transfer(account1, account2, 99);
                      
        
        System.out.println("Client 1 = " + account1.getCountOfMoney());
        System.out.println("Client 2 = " + account2.getCountOfMoney());
    }
}
