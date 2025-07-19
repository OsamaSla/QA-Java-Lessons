package ClassesEx2;
//Circle.java (for Exercise 2)
public class Circle {
 private double area;
 private String color;

 // Constructor
 public Circle(double area, String color) {
     this.area = area;
     this.color = color;
 }

 // Getters
 public double getArea() {
     return area;
 }

 public String getColor() {
     return color;
 }

 // Setters
 public void setArea(double area) {
     this.area = area;
 }

 public void setColor(String color) {
     this.color = color;
 }
}