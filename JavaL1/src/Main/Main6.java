package Main;

import java.util.Scanner; // Import the Scanner class

public class Main6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        // Read the integer input from the user
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is an even number.");
        } else {
            System.out.println("The number " + num + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}