/*
Auther: Damion Shakespear
Date Created: 4/7/2025

This assignment is to make two Subclasses of Account from Chapter_9, a Savings and Checking. While Checking has a Overdraft ammount, Savings does not.
Then write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 */
import java.util.Date;

public class SavingsAccount extends Account {
    
    SavingsAccount(){}

    SavingsAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public SavingsWithdrawl(double withdraw){
        if (withdraw <= balance){
            withdrawl(withdraw);
        }
        else {
            System.out.print("You do not have enough in Savings Account.");
        }
    }
    public String toString(){
        return "\nSavings Account: " + id + "\nBalance: " + balance + "\nDate Created: " + dateCreated;
    }
}