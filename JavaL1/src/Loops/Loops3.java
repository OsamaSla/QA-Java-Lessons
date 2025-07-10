// Even Numbers 1-50 - הדפסת מספרים זוגיים מ-1 עד 50
package Loops;

public class Loops3 {
	public static void main(String[] args) {
    // Loop from 1 to 50
    for (int i = 1; i <= 50; i++) {
        // Check if the number is even (remainder when divided by 2 is 0)
        if (i % 2 == 0) {
            System.out.println(i); // Print the even number
        }
    }
}
}
