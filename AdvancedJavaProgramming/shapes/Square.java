// in this class, we inherit from Rectangle

public class Square extends Rectangle{
	public Square(double length){ // since the square has the same side lengths, we dont need height and width

		// super here means go to the parent class (Rectangle) 
		// and use its constructer with args (length, length),
		// which translates to (double width = length, double height = length)
		super(length, length);
	}
	public String toString(){ // to string method that prints in the formate of => Square : length = [width]
		return "Square : length = [" + this.getWidth() + "]";
	}
}