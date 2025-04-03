/*
Auther: Damion Shakespear
Date Created: 4/1/2025

This assignment is to Create Program to:
Make an Account with an ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%.
Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date when this account was created.
 */
import Account;

public class RunAccount {
    
    public static void main(String[] args){

        Account TestAccount = new Account(1122, 20000);

            TestAccount.setAnnualInterestRate(4.5);
            TestAccount.withdrawl(2500);
            TestAccount.deposit(3000);

            System.out.printf("Your account has a Balance of: %s \nThe Monthly Interest comes to: %s \n%s", TestAccount.getBalance(), TestAccount.getMonthlyIntrest(), TestAccount.getDateCreated());
    }
}
