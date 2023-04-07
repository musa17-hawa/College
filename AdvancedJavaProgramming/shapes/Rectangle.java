// Rectangle class that inherits from the Abstract "Shape"
public class Rectangle extends Shape{
	private double width; // will represent the width of the rectangle object
	private double height; // will represent  the height of the rectangle object

	// adding a contructor
	public Rectangle(double w, double h){ // takes w,h (width and height) as arguments
		this.width = w > 0 ? w : 1; // checks if the provided w is positive else assigns 1 to it
		this.height = h > 0 ? h : 1; // checks if the provided h is positive else assigns 1 to it
	}

	// getWidth method that returns the width of the rectangle
	public double getWidth(){
		return this.width;
	}

	// geHeight method that returns the height of the rectangle object
	public double getHeight(){
		return this.height;
	}

	// setWidth method will check if the provided double is positive and assigne it to the width
	// if not positive, it will assign 1
	public void setWidth(double w){
		double temp = w > 0 ? w : 1; // checks if the provided w is positive else assigns 1 to temp

		// please see explaination below
		if (this instanceof Square){
			this.width = this.height = temp;
		}
		else if (this instanceof Rectangle){
			this.width = temp;
		}
	}

	// setHeight method will check if the provided double is positive and assigne it to the height
	// if not positive, it will assign 1
	public void setHeight(double h){
		double temp = h > 0 ? h : 1; // checks if the provided h is positive else assigns 1 to it



// Explaination:
/*	The order of the if and if else is very important here,
	because each Square is a Rectangle since it inherits from it,
	and each Rectangle is a Shape for the same reason.
	For that, it is true that a Square is a Rectangle a Shape.
	

	Example:
	Square => Rectangle => Shape
	Rectangle => Shape
	Circle => Shape
*/		
		if (this instanceof Square){ // first we check if it is a square
			this.height = this.width = temp; // we make all the sides equale to the desired length, in order to keep it a square, measurement wise.
		}
		else if (this instanceof Rectangle){ // we know that a Rectangle is not a square, (Class/Object wise), so we only change the height
			this.height = temp; // changing the height
		}
	}

	// adding toString method that returns in the following form: Rectangle: width = [width], height = [height]
	public String toString(){
		return "Rectangle: width = [" + this.width + "], height = [" + this.height + "]";
	}

	// implementing abstract methods
	public double area(){
		return this.height * this.width; // area is height * width 
	}

	public double perimeter(){
		return 2 * (this.width + this.height); // the sum of all sides => (2 * width) + (2 * height) => 2 * (height + width) 
	}

}