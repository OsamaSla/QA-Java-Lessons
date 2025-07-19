package ConditionEX; // Checking for Even or Odd Numbers

public class Main2 {
    public static void main(String[] args) {
        int num = 7; // You can change this value to test

        if (num % 2 == 0) {
            System.out.println("The value is " + num + " and this is an even number.");
        } else {
            System.out.println("The value is " + num + " and this is an odd number.");
        }

        // Test with another value
        num = 10;
        if (num % 2 == 0) {
            System.out.println("The value is " + num + " and this is an even number.");
        } else {
            System.out.println("The value is " + num + " and this is an odd number.");
        }
    }
}