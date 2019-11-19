public class Tester{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(c1.getCenterX(), 2, 2.5);

		System.out.println(c1);		
		System.out.println(c2);

		System.out.println("Is (0, 1) inside c1? " + c1.isIn(0, 1));
		System.out.println("Is (0, 4.51) inside c2? " + c2.isIn(0, 4.51));

		System.out.println("c1's area: "+ c1.area());
		System.out.println("c2's area: "+ c2.area());

		System.out.println("c1's perimeter: " + c1.perimeter());
		System.out.println("c2's perimeter: " + c2.perimeter());

		c1.moveTo(3, 4);
		c1.resize(2);
		System.out.println(c1);

		c2.moveTo(2, 1);
		c2.resize(2);
		System.out.println(c2);
		c2.setRaduis(3);
		System.out.println(c2);

		System.out.println("Is (5, 4.1) inside c1? " + c1.isIn(5, 4.1));
		System.out.println("Is (4, 3.2) inside c2? " + c2.isIn(4, 3.2));
	}
}
