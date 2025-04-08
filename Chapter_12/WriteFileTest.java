/*
Auther: Damion Shakespear
Date Created: 4/8/2025

This assignment is to write a program to create a file named Exercise12_15.txt if it does not exist. Write 100 integers created randomly into the file using text I/O. 
Integers are separated by spaces in the file. Read the data back from the file and display the data in increasing order.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WriteFileTest {
    
    public static void main(String[] args) throws Exception {
        java.io.File fileTests = new java.io.File("Exercise12_15.txt");
            if (fileTests.exists()) {
                System.out.println("File 'Exercise12_15.txt' already exists, Here are the contents");
            }
            else {
                try (java.io.PrintWriter output = new java.io.PrintWriter(fileTests)){
                    for (int i = 0; i < 100; i++){
                        output.printf("%s ", ((int) (Math.random() * 10)));
                    }
                }
            }
            readFileTest();
    }
    public static void readFileTest(){
        ArrayList<Integer> GotInput = new ArrayList<>();

        try (Scanner input = new Scanner(new File("Exercise12_15.txt"))){
            for (int i = 0; i < 100; i++){
                GotInput.add(input.nextInt());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(GotInput);

        System.out.print(GotInput);
    }
}
