package Methodot;

public class Main6 {

    // מתודה המקבלת שלושה מספרים שלמים ומחזירה את המספר המינימלי מביניהם
    public static int getMin(int num1, int num2, int num3) {
        int min = num1; // מניחים שהמספר הראשון הוא המינימלי
        if (num2 < min) {
            min = num2; // אם המספר השני קטן יותר, הוא המינימלי החדש
        }
        if (num3 < min) {
            min = num3; // אם המספר השלישי קטן יותר, הוא המינימלי החדש
        }
        return min; // מחזירים את המספר המינימלי
    }
    //               --------------------
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        // קריאה למתודה והדפסת המספר המינימלי
        int minimumNumber = getMin(a, b, c);
        System.out.println("המספר המינימלי מבין " + a + ", " + b + ", " + c + " הוא: " + minimumNumber);

        // דוגמה נוספת
        System.out.println("המספר המינימלי מבין 7, 1, 9 הוא: " + getMin(7, 1, 9));
    }
}
