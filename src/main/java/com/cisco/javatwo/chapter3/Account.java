package com.cisco.javatwo.chapter3;

public class Account {
    private String name; // instance variable
    private double balance; // instance variable
    // Account constructor that receives two parameters

    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
    }
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // if the depositAmount is valid
        balance = balance + depositAmount; // add it to the balance 26
    }

    public void withdraw(double withdrawAmount){
        if((this.balance-withdrawAmount)<0){
            System.out.println("Withdrawal amount exceeded amount balance");
        }
        else{
            this.balance-=withdrawAmount;
        }
    }

        // method returns the account balance
    public double getBalance(){
        return balance;
    }
    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

}
