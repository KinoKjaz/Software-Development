/*
Auther: Damion Shakespear
Date Created: 4/2/2025 

 This assignment is to Create a Class called MyInteger containing specific Methods, then have a Client Progream that tests all Methods in the MyInteger Class
 */
import MyInteger;

public class RunMyInteger {

    public static void main(String[] args) {
    
        MyInteger TestMyInt = new MyInteger(18);

        //Non Static Methods
        System.out.printf("Even: %s, Odd: %s, Prime: %s", TestMyInt.isEven(), TestMyInt.isOdd(), TestMyInt.isPrime());

        //Static Int Methods
            boolean evenInt = MyInteger.isEven(12);
            boolean oddInt = MyInteger.isOdd(12);
            boolean primeInt = MyInteger.isPrime(12);

        System.out.printf("\nEven Int: %s, Odd Int: %s, Prime Int: %s", evenInt, oddInt, primeInt);

        //Static Object Methods
            boolean evenMyInt = MyInteger.isEven(TestMyInt);
            boolean oddMyInt = MyInteger.isOdd(TestMyInt);
            boolean primeMyInt = MyInteger.isPrime(TestMyInt);

        System.out.printf("\nEven MyInt: %s, Odd MyInt: %s, Prime MyInt: %s", evenMyInt, oddMyInt, primeMyInt);

        //Equals Methods
        System.out.printf("\nEquals Int: %s, Equals Obj: %s", TestMyInt.equals(5), TestMyInt.equals(TestMyInt));

        //Parse Methods
            char[] someChar = {'4', '2'};
            String swingHere = "314";

            int parseChar = MyInteger.parseInt(someChar);
            int parseString = MyInteger.parseInt(swingHere);
            
        System.out.printf("\nChar parsed is: %s, String parsed is: %s", parseChar, parseString);

    }
}