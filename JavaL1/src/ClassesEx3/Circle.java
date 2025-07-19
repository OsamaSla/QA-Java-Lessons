package ClassesEx3;
//Circle.java (for Exercise 3)
public class Circle {
 private String color;
 private double radius;

 // Constructor
 public Circle(String color, double radius) {
     this.color = color;
     this.radius = radius;
 }

 // Getters
 public String getColor() {
     return color;
 }

 public double getRadius() {
     return radius;
 }

 // Setters
 public void setColor(String color) {
     this.color = color;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 // Method to calculate area
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}