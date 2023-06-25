package exercise4;

import java.util.Scanner;

public class CircleUse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double radius = s.nextDouble();
		
		Circle circle = new Circle(radius);
		
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		
		s.close();

	}

}
