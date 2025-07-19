package ClassesEx4; // Ex2+3 together
//Shape.java (ניתן ליצור מחלקה אבסטרקטית/ממשק בעתיד, אך לתרגיל זה נסתפק במחלקות נפרדות)

//Rectangle.java
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

//To String
 public String toString() {
     return "Rectangle{" +
            "color='" + color + '\'' +
            ", height=" + height +
            ", width=" + width +
            ", area=" + calculateArea() +
            '}';
 }
}