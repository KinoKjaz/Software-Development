/*
Auther: Damion Shakespear
Date Created: 4/1/2025

This assignment is to make an account class that calculates the balance, Interest Rates, and Withdraws/Deposits.
 */
import java.util.Date;

public class Account {
    
    private int id;
    private double balance;
    private double annualIntrestRate;

    private Date dateCreated;

    Account(){}

    Account(int newID, double newBalance){
        id = newID;
        balance = newBalance;
        dateCreated = new Date();
    }
    

    public int getID(){
        return id;
    }
    public void setID(int newID){
        id = newID;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public double getAnnualInterestRate(){
        return annualIntrestRate;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualIntrestRate = newAnnualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }


    double getMonthlyIntrestRate(){
        return (annualIntrestRate /100) / 12;
    }
    double getMonthlyIntrest(){
        return balance * getMonthlyIntrestRate();
    }
    public double withdrawl(double withdraw){
       return balance -= withdraw;
    }
    public double deposit(double deposit){
       return balance += deposit;
    }
}

