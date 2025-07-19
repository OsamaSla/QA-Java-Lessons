package Methodot;

public class Main2 {

    // מתודה המקבלת שם כפרמטר ומדפיסה אותו
    public static void printYourName(String myName) {
        System.out.println("השם שהתקבל הוא: " + myName);
    }
    //               --------------------
    public static void main(String[] args) {
        // קריאה למתודה עם שם ספציפי
        printYourName("אברהם"); // ניתן לשנות את השם כאן
        printYourName("שרה");   // דוגמה נוספת
    }
}
