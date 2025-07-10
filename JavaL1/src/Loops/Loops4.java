// Modulo 4 Remainder 2 - הדפסת מספרים מ-1 עד 100 המתחלקים ב-4 עם שארית 2
package Loops;

public class Loops4 {
	public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number divided by 4 has a remainder of 2
            if (i % 4 == 2) {
                System.out.println(i); // Print the number
            }
        }
    }
}
