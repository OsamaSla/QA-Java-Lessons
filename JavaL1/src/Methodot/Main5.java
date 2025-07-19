package Methodot;

public class Main5 {

    // מתודה המקבלת מספר שלם ומחזירה את המספר בתוספת 10
    public static int sumNum(int myNum) {
        return myNum + 10;
    }
    //               --------------------
    public static void main(String[] args) {
        int number = 5; // המספר שאותו נשלח למתודה
        // קריאה למתודה והדפסת הערך שהוחזר ממנה
        int result = sumNum(number);
        System.out.println("התוצאה של " + number + " + 10 היא: " + result);

        // דוגמה נוספת
        System.out.println("התוצאה של 20 + 10 היא: " + sumNum(20));
    }
}
