// Prime Numbers 2-100 - מציאת מספרים ראשוניים בין 2 ל-100
package Loops;

public class Loops8 {public static void main(String[] args) {
    System.out.println("Prime numbers between 2 and 100 are:");

    // Outer loop to iterate through numbers from 2 to 100
    for (int i = 2; i <= 100; i++) {
        boolean isPrime = true; // Assume the current number is prime

        // Inner loop to check for divisibility. We only need to check up to the square root of i.
        // If a number has a divisor greater than its square root, it must also have one smaller than its square root.
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) { // If i is divisible by j, it's not prime
                isPrime = false; // Set isPrime to false
                break;           // No need to check further divisors, break from inner loop
            }
        }

        if (isPrime) { // If isPrime is still true after checking all divisors
            System.out.println(i); // Print the prime number
        }
    }
}
}

