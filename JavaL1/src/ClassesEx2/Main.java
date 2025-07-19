package ClassesEx2;
//Main.java (for Exercise 2)
public class Main {
 public static void main(String[] args) {
     // יצירת אובייקטים
     Circle myCircle = new Circle(78.5, "Blue"); // שטח של מעגל עם רדיוס 5
     Rectangle myRectangle = new Rectangle(50.0, "Green"); // שטח של מלבן 10x5

     // הדפסת צבע ושטח לכל אובייקט
     System.out.println("--- Exercise 2 ---");
     System.out.println("Circle:");
     System.out.println("Color: " + myCircle.getColor());
     System.out.println("Area: " + myCircle.getArea());

     System.out.println("\nRectangle:");
     System.out.println("Color: " + myRectangle.getColor());
     System.out.println("Area: " + myRectangle.getArea());
 }
}