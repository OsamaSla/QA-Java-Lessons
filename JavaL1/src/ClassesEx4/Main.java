package ClassesEx4; // Ex2+3 together
//Main.java
public class Main {
 public static void main(String[] args) {
     // יצירת אובייקטים - מלבן ומעגל
     Circle myCircle = new Circle("Blue", 7.0); // מעגל כחול עם רדיוס 7
     Rectangle myRectangle = new Rectangle("Green", 12.0, 8.0); // מלבן ירוק בגובה 12 וברוחב 8

     // הדפסת צבע ושטח לכל אובייקט
     System.out.println("--- צורות מאוחדות (תרגיל 2 + 3) ---");

     System.out.println("מעגל:");
     System.out.println("צבע: " + myCircle.getColor());
     System.out.println("שטח: " + myCircle.calculateArea()); // קוראים למתודה שמחשבת את השטח

     System.out.println("\nמלבן:");
     System.out.println("צבע: " + myRectangle.getColor());
     System.out.println("שטח: " + myRectangle.calculateArea()); // קוראים למתודה שמחשבת את השטח

     // דוגמה לשימוש ב-toString (אופציונלי)
     System.out.println("\n--- הדפסה באמצעות toString ---");
     System.out.println(myCircle);
     System.out.println(myRectangle);
 }
}