package ClassesEx1;
//Rectangle.java (for Exercise 2)
public class Main {
 private double area;
 private String color;

 // Constructor
 public Main(double area, String color) {
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