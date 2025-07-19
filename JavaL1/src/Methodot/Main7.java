package Methodot;

public class Main7 {

    // מתודה המקבלת מספר שלם ומחזירה אמת אם הוא זוגי, ושקר אם הוא אי-זוגי
    public static boolean isZugi(int myNum) {
        // מספר זוגי הוא מספר ששארית חלוקתו ב-2 היא 0
        if (myNum % 2 == 0) {
            return true; // המספר זוגי
        } else {
            return false; // המספר אי-זוגי
        }
        // דרך קצרה יותר: return myNum % 2 == 0;
    }
    //               --------------------
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;

        // בדיקה והדפסה עבור מספרים שונים
        System.out.println("האם " + num1 + " זוגי? " + isZugi(num1));
        System.out.println("האם " + num2 + " זוגי? " + isZugi(num2));
        System.out.println("האם 0 זוגי? " + isZugi(0));
    }
}
