package com.example.android.swiperefreshlistfragment;

/**
 * Created by rigo on 9/13/15.
 */
public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private double balance;
    private double[] recentPurch;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double[] getRecentPurch() {
        return recentPurch;
    }

    public void setRecentPurch(double[] recentPurch) {
        this.recentPurch = recentPurch;
    }

    public Customer() {
    }

    public Customer(String customerID, String firstName, String lastName, double balance, double[] recentPurch) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.recentPurch = recentPurch;
    }
}
