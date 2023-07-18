package exercise16;

public class Main {

	public static void main(String[] args) {

		//CREATE RECTANGLE WITH HEIGHT 10.5 and WIDTH 20.5 and FIND AREA AND PERIMETER
		Shape rectangle = new Rectangle(10.5 , 20.5);
		System.out.println("RECTANGLE CREATED WITH HEIGHT 10.5 and WIDTH 20.5");
		System.out.println("AREA= "+rectangle.getArea());
		System.out.println("PERIMETER= "+rectangle.getPerimeter());

		//CREATE CIRCLE WITH RADIUS 5.8 and FIND AREA AND PERIMETER
		Shape circle = new Circle(5.8);
		System.out.println("\nCIRCLE CREATED WITH RADIUS 5.8");
		System.out.println("AREA= "+circle.getArea());
		System.out.println("PERIMETER= "+circle.getPerimeter());

		//CREATE TRIANGLE WITH SIDES 10, 11, 12 and FIND AREA AND PERIMETER
		Shape triangle = new Triangle(10, 11, 12);
		System.out.println("\nTRIANGLE CREATED WITH SIDES 10, 11, 12");
		System.out.println("AREA= "+triangle.getArea());
		System.out.println("PERIMETER= "+triangle.getPerimeter());


	}

}
