package exercise3;

import java.util.Scanner;

public class RectangleUse {

	public static void main(String[] args) {
		
		//Creating scanner to take user input and taking inputs from user
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the width of rectangle: ");
		double width = s.nextDouble();
		System.out.print("Enter the height of rectangle: ");
		double height = s.nextDouble();
		
		
		//Created Rectangle 
		Rectangle rectangle = new Rectangle(width, height);
		
		
		//Printing Area and Perimeter of Rectangle
		System.out.println("Area of Rectangle is: " + rectangle.getArea());
		System.out.println("Perimeter of Rectangle is: " + rectangle.getPerimeter());
		
		s.close(); //Closing the Scanner

	}

}
