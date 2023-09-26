import AllShape.*;

public class Shape{
	public static void main(String[] args){
		// Creating Objects
		Rectangle rect = new Rectangle();
		Square sqr = new Square();
		Circle circ = new Circle();
		
		// Set parameters
		rect.setLength(5);
		rect.setWidth(6);
		
		sqr.setLength(8);
		
		circ.setRadius(3);
		
		// Calculating Area
		System.out.println("Area of Rectangle: " + rect.calcArea());
		System.out.println("Area of Square: " + sqr.calcArea());
		System.out.println("Area of Circle: " + circ.calcArea());
	}
}