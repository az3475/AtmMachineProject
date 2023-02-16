package com.atmproject;

public class ATM {

    private  double balance;
    private double depositeAmount;
    private double withdraw;
    public ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositeAmount() {
        return depositeAmount;
    }

    public void setDepositeAmount(double depositeAmount) {
        this.depositeAmount = depositeAmount;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
}
