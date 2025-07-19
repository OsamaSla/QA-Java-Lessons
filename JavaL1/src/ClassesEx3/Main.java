package ClassesEx3;
//Main.java (for Exercise 3)
public class Main {
 public static void main(String[] args) {
     // יצירת אובייקטים
     Circle myCircle = new Circle("Red", 5.0);
     Rectangle myRectangle = new Rectangle("Yellow", 10.0, 5.0);

     // הדפסת צבע ושטח לכל אובייקט
     System.out.println("\n--- Exercise 3 ---");
     System.out.println("Circle:");
     System.out.println("Color: " + myCircle.getColor());
     System.out.println("Area: " + myCircle.calculateArea());

     System.out.println("\nRectangle:");
     System.out.println("Color: " + myRectangle.getColor());
     System.out.println("Area: " + myRectangle.calculateArea());
 }
}