package ClassesEx3;
//Rectangle.java (for Exercise 3)
public class Rectangle {
 private String color;
 private double height;
 private double width;

 // Constructor
 public Rectangle(String color, double height, double width) {
     this.color = color;
     this.height = height;
     this.width = width;
 }

 // Getters
 public String getColor() {
     return color;
 }

 public double getHeight() {
     return height;
 }

 public double getWidth() {
     return width;
 }

 // Setters
 public void setColor(String color) {
     this.color = color;
 }

 public void setHeight(double height) {
     this.height = height;
 }

 public void setWidth(double width) {
     this.width = width;
 }

 // Method to calculate area
 public double calculateArea() {
     return height * width;
 }
}