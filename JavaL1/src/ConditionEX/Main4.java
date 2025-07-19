package ConditionEX; // Reading User Input (Age)

import java.util.Scanner; // Import the Scanner class

public class Main4 {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner scanner1 = new Scanner(System.in);

		System.out.print("Please enter your age: ");
		// Read the integer input from the user
		int age = scanner1.nextInt();

		// Print the age back to the user
		System.out.println("Your age is: " + age);

		// Close the scanner to release system resources
		scanner1.close();
	}
}