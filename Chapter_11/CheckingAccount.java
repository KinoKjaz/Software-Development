/*
Auther: Damion Shakespear
Date Created: 4/7/2025

This assignment is to make two Subclasses of Account from Chapter_9, a Savings and Checking. While Checking has a Overdraft ammount, Savings does not.
Then write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 */
import java.util.Date;

public class CheckingAccount extends Account {

    CheckingAccount(){}

    CheckingAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public CheckingWithdrawl(double withdraw){
        if (withdraw <= balance + 200){
            withdrawl(withdraw);
        }
        else {
            System.out.print("You do not have enough in Checking Account.");
        }
    }
    public String toString(){
        return "\nChecking Account: " + id + "\nBalance: " + balance + "\nDate Created: " + dateCreated;
    }
}