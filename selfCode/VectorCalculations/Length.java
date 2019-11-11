import java.lang.Math;

public class Length{
	public static void main(String[] args) {

		Vectors v = new Vectors(1,1,5);
		Vectors u = new Vectors(-4,0,-2);

		double newVx = u.getX() - v.getX();
		double newVy = u.getY() - v.getY();
		double newVz = u.getZ() - v.getZ();

		System.out.println("("+newVx+","+newVy+","+newVz+")");


		double length = Math.sqrt(Math.pow(newVx,2) + Math.pow(newVy,2) + Math.pow(newVz,2));
		System.out.println("the norma of the new vector is : " + length);

		
	}
}