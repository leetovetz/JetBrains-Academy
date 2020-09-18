package com.company;

public class Account {

    private double countOfMoney;

    public Account(double countOfMoney) {
        this.countOfMoney = countOfMoney;
    }

    public double getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfAddedMoney(double amount) {
        countOfMoney = countOfMoney + amount;
    }

    public void setCountOfRemovedMoney(double amount) {
        countOfMoney = countOfMoney - amount;
    }

}
