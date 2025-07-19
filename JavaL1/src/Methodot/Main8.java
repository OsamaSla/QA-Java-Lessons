package Methodot;

import java.util.Scanner;

public class Main8 {

    // מתודה למציאת המספר המקסימלי מבין שלושה
    public static int getMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    // מתודה למציאת המספר המינימלי מבין שלושה
    public static int getMin(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

    // מתודה לחישוב סכום שלושה מספרים
    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // מתודה לחישוב ממוצע שלושה מספרים (התוצאה תהיה double כדי לכלול שברים)
    public static double getAverage(int num1, int num2, int num3) {
        // חשוב לבצע המרה ל-double לפני החלוקה כדי לקבל תוצאה מדויקת
        return (double) getSum(num1, num2, num3) / 3;
    }
    //               --------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // יצירת אובייקט Scanner

        System.out.print("אנא הכנס את המספר הראשון: ");
        int num1 = scanner.nextInt(); // קליטת המספר הראשון

        System.out.print("אנא הכנס את המספר השני: ");
        int num2 = scanner.nextInt(); // קליטת המספר השני

        System.out.print("אנא הכנס את המספר השלישי: ");
        int num3 = scanner.nextInt(); // קליטת המספר השלישי

        // הדפסת התוצאות באמצעות קריאה למתודות השונות
        System.out.println("--- תוצאות ---");
        System.out.println("המספר המקסימלי: " + getMax(num1, num2, num3));
        System.out.println("המספר המינימלי: " + getMin(num1, num2, num3));
        System.out.println("סכום המספרים: " + getSum(num1, num2, num3));
        System.out.println("ממוצע המספרים: " + getAverage(num1, num2, num3));

        scanner.close(); // סגירת ה-Scanner
    }
}
