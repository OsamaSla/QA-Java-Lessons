package Main;

public class Main4 {
    public static void main(String[] args) {
        int a = 15; // You can change these values to test
        int b = 10;

        if (a > b) {
            System.out.println("a is the larger number.");
        } else if (b > a) {
            System.out.println("b is the larger number.");
        } else {
            System.out.println("Both numbers are identical.");
        }

        // Test with other values
        a = 5;
        b = 20;
        if (a > b) {
            System.out.println("a is the larger number.");
        } else if (b > a) {
            System.out.println("b is the larger number.");
        } else {
            System.out.println("Both numbers are identical.");
        }

        a = 7;
        b = 7;
        if (a > b) {
            System.out.println("a is the larger number.");
        } else if (b > a) {
            System.out.println("b is the larger number.");
        } else {
            System.out.println("Both numbers are identical.");
        }
    }
}