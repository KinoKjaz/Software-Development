/*
 Auther: Damion Shakespear
Date Created: 4/2/2025 

 This assignment is to Create a Class called MyInteger containing specific Methods, then have a Client Progream that tests all Methods in the MyInteger Class
 */
public class MyInteger{

    int value;

    MyInteger(int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }

//Non Static Methods
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public boolean isPrime(){
        if (value <= 1){
            return false;
        }
        for (int i = 2; i * i <= value; i++){
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }

//Static Int Methods
    public static boolean isEven(int valueTest){
        return valueTest % 2 == 0;
    }
    public static boolean isOdd(int valueTest){
        return valueTest % 2 != 0;
    }
    public static boolean isPrime(int valueTest){
        if (valueTest <= 1){
            return false;
        }
        for (int i = 2; i * i <= valueTest; i++){
            if (valueTest % i == 0){
                return false;
            }
        }
        return true;
    }

//Static Object Methods
    public static boolean isEven(MyInteger TestMyInt){
        return TestMyInt.getValue() % 2 == 0;
    }
    public static boolean isOdd(MyInteger TestMyInt){
        return TestMyInt.getValue() % 2 != 0;
    }
    public static boolean isPrime(MyInteger TestMyInt){
        if (TestMyInt.getValue() <= 1){
            return false;
        }
        for (int i = 2; i * i <= TestMyInt.getValue(); i++){
            if (TestMyInt.getValue() % i == 0){
                return false;
            }
        }
        return true;
    }

//Equals Methods
    public boolean equals(int newerValue){
        return value == newerValue;
    }
    public boolean equals(MyInteger TestMyInt){
        return TestMyInt.equals(value);
    }

//Parse Methods
    public static int parseInt(char[] someChar){
        String getInt = new String(someChar);
        return Integer.parseInt(getInt);
    }
    public static int parseInt(String swingHere){
        return Integer.parseInt(swingHere);
    }
}