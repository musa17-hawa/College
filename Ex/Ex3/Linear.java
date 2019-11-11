public class Linear{
	double a, b;

	public Linear(double a, double b){
		this.a = a;
		this.b = b;

	}

	public Linear(Linear lin){
		a = lin.a;
		b = lin.b;

	}

	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}

	public double assign(double x){
		return this.a*x+this.b;
	}

	public double solve(double y){
		return (y-this.b)/this.a;
	}

	public double getIntersection(Linear other){
		return (this.b - other.b)/(other.a - this.a);
		
	}

	public boolean isOnLine(double x, double y){
		if(this.a*x+this.b == y){
			return true;
		}
		return false;
	}

	public boolean areParallel(Linear other){
		if(this.a == other.a){
			return true;
		}
		return false;
	}

	public Linear createLinear(double x1, double y1, double x2, double y2){
		a = (y2-y1)/(x2-x1);
		b = y1-(a*x1);
		Linear obj = new Linear(a,b);
		return obj;

	}
	
	public String toString(){
		if(a == 0 && b == 0){
			return "y = 0";
		}
		else if(a == 0 && b!=0){
			return "y = "+b;
		}
		else if(b == 0 && a != 0){
			return "y = "+a+"x";
		}
		else if(b < 0){
			return "y = "+a+"x"+b;
		}
		return "y = "+a+"x"+"+"+b;
	}


}