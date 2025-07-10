// Even/Odd Input Loop - בדיקת מספר זוגי/אי-זוגי בלולאה עד קליטת 1-
package Loops;
import java.util.Scanner; // Import the Scanner class for user input

public class Loops6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        int num; // Declare number variable

        // Loop indefinitely until the user enters -1
        do {
            System.out.print("Please enter a number (enter -1 to exit): "); // Prompt user
            num = scanner.nextInt(); // Read integer input

            if (num != -1) { // If the input is not -1, check if it's even or odd
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is an even number.");
                } else {
                    System.out.println("The number " + num + " is an odd number.");
                }
            }
        } while (num != -1); // Continue loop as long as num is not -1

        System.out.println("Exiting program."); // Message when program exits
        scanner.close(); // Close the scanner to release resources
    }
}