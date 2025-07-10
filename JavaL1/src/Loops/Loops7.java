// Multiply and Check Loop - הכפלת מספר בעצמו, הדפסה אם התוצאה גדולה מ-30, לולאה עד קליטת 0
package Loops;
import java.util.Scanner; // Import the Scanner class for user input

public class Loops7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        int num; // Declare number variable

        // Loop indefinitely until the user enters 0
        do {
            System.out.print("Please enter a number (enter 0 to exit): "); // Prompt user
            num = scanner.nextInt(); // Read integer input

            if (num != 0) { // If the input is not 0
                int result = num * num; // Multiply the number by itself
                if (result > 30) { // Check if the result is greater than 30
                    System.out.println("The result (" + num + " * " + num + ") is: " + result); // Print if true
                } else {
                    System.out.println("The result (" + result + ") is not greater than 30."); // Inform if false
                }
            }
        } while (num != 0); // Continue loop as long as num is not 0

        System.out.println("Exiting program."); // Message when program exits
        scanner.close(); // Close the scanner to release resources
    }
}

