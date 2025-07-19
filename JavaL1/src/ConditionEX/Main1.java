package ConditionEX; // checking age conditions

public class Main1 {
	 public static void main(String[] args) {
	        int age = 23; // You can change this value to test

	        if (age < 18) {
	            System.out.println("He is a minor.");
	        } else if (age > 66) {
	            System.out.println("He is a pensioner.");
	        } else if (age == 18) {
	            System.out.println("He is 18 years old.");
	        } else {
	            System.out.println("His age is " + age + "."); // For other ages
	        }

	        // Test with different values
	        age = 15;
	        if (age < 18) {
	            System.out.println("He is a minor.");
	        } else if (age > 66) {
	            System.out.println("He is a pensioner.");
	        } else if (age == 18) {
	            System.out.println("He is 18 years old.");
	        } else {
	            System.out.println("His age is " + age + ".");
	        }

	        age = 70;
	        if (age < 18) {
	            System.out.println("He is a minor.");
	        } else if (age > 66) {
	            System.out.println("He is a pensioner.");
	        } else if (age == 18) {
	            System.out.println("He is 18 years old.");
	        } else {
	            System.out.println("His age is " + age + ".");
	        }

	        age = 18;
	        if (age < 18) {
	            System.out.println("He is a minor.");
	        } else if (age > 66) {
	            System.out.println("He is a pensioner.");
	        } else if (age == 18) {
	            System.out.println("He is 18 years old.");
	        } else {
	            System.out.println("His age is " + age + ".");
	        }
	    }
	}
