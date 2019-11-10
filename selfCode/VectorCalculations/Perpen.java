import java.lang.Math;

class Perpen{
	public static void main(String[] args) {

		Vectors v = new Vectors(0,0,1);
		Vectors u = new Vectors(1,0,0);

		if (((v.getX()*u.getX()) + (v.getY()*u.getY()) + (v.getZ()*u.getY())) == 0 ){
			System.out.println("("+v.getX()+","+v.getY()+","+v.getZ()+"), " + "("+u.getX()+","+u.getY()+","+u.getZ()+") are Perpendicular." );
		}
		else{
			System.out.println("("+v.getX()+","+v.getY()+","+v.getZ()+"), " + "("+u.getX()+","+u.getY()+","+u.getZ()+") are NOT Perpendicular." );

		}

	}
}
