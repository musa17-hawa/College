// imports.
import java.lang.Math;

// class circle that contains all of its characteristics.
public class Circle{
	public double centerX;
	public double centerY;
	public double radius;

	// a circle class constructor in which if you made a new object without
	// giving it any paremeters it would make an object that its (x,y) are (0,0)
	// and its radius would be 1.0.
	public Circle(){
		this.radius = 1;

	}

	// a circle constructor that takes (x,y) coordinates and the radius as paremeters
	// and checks if the given radius is a negative number, if so, it sets the radius to 1.0.
	// otherwise, it would set the radius to the given paremeter.
	public Circle(double x, double y, double r){
		this.centerX = x;
		this.centerY = y;
		if (r < 0){
			 this.radius = 1;
		}
		else{
			this.radius = r;
		}
	}

	// making getters and setters for centerX.
	public double getCenterX(){
		return centerX;
	}
	public void setCenterX(double newCenterX){
		this.centerX = newCenterX;
	}
//_______________________________________________

	// making getters and setters for centerY.
	public double getCenterY(){
		return centerY;
	}
	public void setCenterY(double newCenterY){
		this.centerY = newCenterY;
	}
//_______________________________________________

	// making getters and setters for radius.
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius){
		this.radius = (newRadius > 0) ? newRadius : this.radius;
	}
//______________________________________________

	// making a method to print all of the paremeters of the Circle object.
	public String toString(){
		return "Circle at (" +centerX+ "," +centerY+ ") radius " +radius;
	}
//______________________________________________
//______________________________________________

	// a method which calculates the area of the Circle Object and returns it.
	public double area(){
		return Math.PI*Math.pow(radius,2);
	}

	// a method which calculates the perimeter(circumference) of the Circle Object and returns it.
	public double perimeter(){
		return 2*Math.PI*radius;
	}

	//a method that resizes the Circle Object by multiplying the radius by a factor
	public void resize(double factor){

		this.radius = (factor > 0) ? this.radius*factor : this.radius;
	}

	// a method which changes the center of the Circle Object.
	public void moveTo(double x, double y){
		this.setCenterX(x);
		this.setCenterY(y);
	}

	// a method that checks if a given(x,y) point is IN the borders of the Circle Object,
	// or ON the borders of the Circle Object
	public boolean isIn(double x, double y){

		// checking if the distance between the point and the center of the Circle Object,
		// is less than or equale to the radius(borders) of the Circle Object,
		// if so the it is indeen inside or on the Circle Object.
		// otherwise, it is not.
		return Math.sqrt(Math.pow((this.centerX - x), 2)+Math.pow((this.centerY - y), 2)) <= this.radius;
	} // the end of the method.

//______________________________________________

} // the end of the Circle class

