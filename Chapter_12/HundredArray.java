/*
Auther: Damion Shakespear
Date Created: 4/8/2025

This assignment is to make an Array with 100 random Integers. Then prompts the user to enter an index of the array, then displays the corresponding element value. 
If the specified index is out of bounds, display the message Out of Bounds.
 */
import java.util.Scanner;

public class HundredArray {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] Hundred = new int[100];

        for (int i = 0; i < Hundred.length; i++){
            Hundred[i] = (int) (Math.random() * 10);
        }
        
        System.out.printf("Please enter a Number to check: ");
        int pick = input.nextInt();

            try {
                System.out.printf("It is: %s", Hundred[pick]);
              }
              catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds");
              }
        }
    }
