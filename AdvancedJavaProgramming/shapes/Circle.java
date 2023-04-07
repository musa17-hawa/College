// Circle class that inherits from the Abstract class "Shape"
public class Circle extends Shape{
	private double radius; // Class Circle radius characteristic

	final double PI = 3.141592653589793238; // defining the constant of PI since I dont know if we can import math in this Exercise 


	// making a constructor for the class shape that takes double r (raduis) as an input.
	// in addition it checks if the raduis that is provided is a positive double
	// if yes it sets the radius to the given double,
	// if not it sets the radius to one.
	public Circle (double r){
		this.radius = r > 0 ? r : 1;
	}

	// getRadius method, to return the value of the radius
	public double getRadius(){
		return this.radius; // this is where the check happens
	}

	// setRadius method, to set the value of the radius,
	// in addition it checks if the raduis that is provided is a positive double
	// if yes it sets the radius to the given double,
	// if not it sets the radius to one.
	public void setRadius(double r){
		this.radius = r > 0 ? r : 1; // this is where the check happens
	}

	// creating a toString method that returns in this formate ==> Circle: radius = [radius]
	public String toString(){
		return "Circle: radius = [" + this.radius + "]";
	}

	// implementing abstract methods
	public double area(){
		return PI * (this.radius * this.radius); // calculating the area, pi * (radius squared) but since the package math is not imported, we cant use Math.pow()
	}

	public double perimeter(){		
		return 2 * PI * this.radius; // calculating the circumference which is 2*pi*radius 
	}
}
