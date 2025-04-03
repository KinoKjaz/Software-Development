/*
Auther: Damion Shakespear
Date Created: 4/3/2025

This assignment is to Create Program to:
Simulate an ATM machine with 10 Accounts, using the Account Class from Chapter_9
 */
import java.util.Scanner;
import Account;

public class AccountATM {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        Account[] ATM = new Account[10];

        for (int i = 0; i < ATM.length; i++){
            ATM[i] = new Account(i, 100);
        }

        boolean End = false;

        while (!End){
            int ID = 0;

            System.out.printf("\nPlease Enter ID: ");
                ID = input.nextInt();

            if (ID >= 0 && ID <= 9){
                AccountStat(ATM, ID);
            }
            else {
                System.out.printf("\nSorry ID Invalid");
            }
        }
    }
            
    public static void AccountStat(Account[] ATM, int ID){
    Scanner input = new Scanner(System.in);

        boolean Stop = false;

        while (!Stop){ 
            switch (AccountChoice()){
                case 1: 
                    System.out.printf("\nYour Balance is: $%2.2f", ATM[ID].getBalance());
                        break;
                case 2:
                    System.out.printf("\nHow much do you want to Withdraw? \n$");
                    double withdraw = input.nextDouble();
                    ATM[ID].withdrawl(withdraw);
                        break;
                case 3:
                    System.out.printf("\nHow Much do you want to Deposit? \n$");
                    double deposit = input.nextDouble();
                    ATM[ID].deposit(deposit);
                        break;
                case 4:
                System.out.printf("\nGoodBye");
                    Stop = true;
                        break;
                default:
                    System.out.printf("\nSorry could not understand that.");
            }
        }
    }

    public static int AccountChoice(){
    Scanner input = new Scanner(System.in);

        System.out.printf("\nMain Menu\nCheck Balance: 1\nWithdraw: 2\nDeposit: 3\nExit: 4\nEnter Selection Here: ");
        return input.nextInt();
    }
}
