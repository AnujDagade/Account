package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    final OutputInterface mOut;


    private String name;
    private int number;
    private double balance;

    /**
     * Constructor initializes the field
     */
    public Account(OutputInterface out) {
        mOut = out;
    }

    public Account( OutputInterface out,String name, int number) {
        mOut = out;
        this.name = name;
        this.number = number;
    }

    public Account(OutputInterface out, String name, int number, double balance) {
        mOut = out;
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    // Important note on constructors...
    // Each constructor that you add should take an OutputInterface parameter that
    // is used to initialize mOut (similar to the constuctor above).
    // Please remember to add that parameter to the code that you see in the lectures.

    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public boolean withdrawal(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        else {
            //mOut.println("Insufficient Funds");
            return false;
        }
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " +name+": "
                     + number
                     + " is " 
                     + balance);
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return  number;
    }

    public double getBalance() {
        return balance;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  String toString(){
        return ("Account holder: "+this.getName()+"\n"+ "Number: " + this.getNumber());
    }

    public boolean equals(Object other) {
        if(other instanceof Account) {
            Account acc = (Account) other;
            return number == acc.number;
        } else {
            return false;
        }
    }
}
