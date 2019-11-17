public class Parallel{
	public static void main(String[] args) {

		Vectors v = new Vectors(1,0,1);
		Vectors u = new Vectors(2,2,4);


		double xRatio = v.getX()/u.getX();
		double yRatio = v.getY()/u.getY();
		double zRatio = v.getZ()/u.getZ();


		if (xRatio == yRatio && xRatio == zRatio){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}


	}
}