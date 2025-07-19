package ConditionEX; // Checking User Input for Even (zugi) or Odd (E-Zugi)
import java.util.Scanner; // Import the Scanner class

public class Main5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner S1 = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        // Read the integer input from the user
        int num = S1.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is an even number.");
        } else {
            System.out.println("The number " + num + " is an odd number.");
        }

        // Close the scanner
        S1.close();
    }
}