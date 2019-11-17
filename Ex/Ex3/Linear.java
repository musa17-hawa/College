//making Linear class that represents a linear equation as y = ax+b
public class Linear{
	// the linear equation is gonna have two characteristics which are,
	// a : which is the coefficient of x which aslo means the slope
	// b : which is the x coordinate of the equation when it hits the y axe
	double a, b;

	// making a constructor method that takes a and b as parameters
	public Linear(double a, double b){
		this.a = a;
		this.b = b;

	}

	// making a copy constructor method
	public Linear(Linear lin){
		this.a = lin.a;
		this.b = lin.b;

	}
	// a method that returns the value of a
	public double getA(){
		return this.a;
	}
	// a method that returns the value of b
	public double getB(){
		return this.b;
	}

	// this method takes a value of (x) and puts it into the equation,
	// returns the value of y coresponding to the input x and the two,
	// characteristics which are a and b
	public double assign(double x){
		// putting the value of (x) into the equation
		return this.a*x+this.b; // returns the value of y
	}

	// this method takes a value of y and puts into the equation,
	// returns the value of (x) coresponding to the input y and the two,
	// characteristics which are a and b
	public double solve(double y){
		// y = ax + b ==> x = (y-b)/a
		return (y-this.b)/this.a; // returns the value of x
	}

	// this method takes another Linear object and returns,
	// the x coordinant in which the two Linear objects(linear equations),
	// intersect with each other
	public double getIntersection(Linear other){
		// orginal object(y1 = a1x+b1)
		// other object(y2 = a2x+b2)

		// y1 = a1x+b1, y2 = a2x+b2,

		// if they both intersect then,
		// y1 = y2 then,
		// a1x+b1 = a2x+b2 ==> x = (b1-b2)/(a2 - a1)


		return (this.b - other.b)/(other.a - this.a); // if (other.a == this.a) ==> infinity
		
	}

	// this method takes (x,y) coordinants and checks whether,
	// this point(x,y) is actually on the line which the equation,
	// graphes, returns true if so, false if otherwise
	public boolean isOnLine(double x, double y){
		// (x,y) is the point we need to check
		// y = ax+b 
		// if 'y'(the input) = a*'x'(the input) + b ==> true
		// else ==> false
		if(this.a*x+this.b == y){
			return true;
		}
		return false;
	}

	// this method takes another Linear object(linear equation) as an input,
	// and checks whether if the orginal equation(Linear object) is actually parallel to the,
	// input linear equation(other - Linear object - ), returns true if they both are indeed parallel,
	// false if otherwise
	public boolean areParallel(Linear other){
		// a is the slope of the equation

		// this.a = a of the orginal object
		// other.a = a of the other object

		// if a1 == a2 then they are parallel(they both have the same slope) ==> true
		if(this.a == other.a){
			return true;
		}
		return false;
	}

	// this method takes two points(x1,y1),(x2,y2) as inputs and simply
	// creats an equation(Linear object) for this line(the two points connected through a line),
	// and returns it(the new Linear object - linear equation)
	public Linear createLinear(double x1, double y1, double x2, double y2){
		// a = the slope ==> delta y / delta x
		// b = the x coordinant when the equation hits the y axe,

		// y = ax+b ==> b = y - a*x 
		this.a = (y2-y1)/(x2-x1);
		this.b = y1-(a*x1);

		// creating the new Linear object with the parameters (a,b),
		// which are calculated above
		Linear obj = new Linear(a,b);

		// returning the new Linear object
		return obj;

	}
	
	// this method represents the Linear object as a linear equation,
	// returns it as a string
	public String toString(){
		// y = ax+b

		// if a,b = 0 ==> y = 0
		if(this.a == 0 && this.b == 0){
			return "y = 0";
		}

		// if a = 0, b is not 0 ==> y = b
		else if(this.a == 0 && this.b!=0){
			return "y = "+this.b;
		}

		// if b = 0, a is not 0 ==> y = ax
		else if(this.b == 0 && this.a != 0){
			return "y = "+this.a+"x";
		}

		// if a != 0,  b < 0 ==> y = ax-b
		else if(this.b < 0){
			return "y = "+this.a+"x"+this.b;
		}
		// if a != 0, b > 0 ==> y = ax + b
		return "y = "+this.a+"x"+"+"+this.b;
	}


}