public class test{
	public static void main(String[] args) {
		Room r = new Room("x", 1);
		Room r1 = new Room("x", 1);
		//r = r1;// ==> aliasing

		Room r2 = new Room(r);
		Room r3 = null;

		r.setArea(5);
		System.out.println(r == r1);
		System.out.println(r == r2);
		System.out.println(r == r);
		System.out.println(r.getArea());
		System.out.println(r1.getArea()); // affect of aliasing
		System.out.println(r2.getArea());
		System.out.println(r3.getType());

	}
}