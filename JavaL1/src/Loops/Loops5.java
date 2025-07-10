// Age Input Loop - קליטת גיל משתמש בלולאה עד קליטת 1-
package Loops;
import java.util.Scanner; // Import the Scanner class for user input

public class Loops5 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    int age; // Declare age variable

    // Loop indefinitely until the user enters -1
    do {
        System.out.print("Please enter your age (enter -1 to exit): "); // Prompt user
        age = scanner.nextInt(); // Read integer input

        if (age != -1) { // If the input is not -1, print the age
            System.out.println("Your age is: " + age);
        }
    } while (age != -1); // Continue loop as long as age is not -1

    System.out.println("Exiting program."); // Message when program exits
    scanner.close(); // Close the scanner to release resources
}
}