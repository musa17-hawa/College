public class Tester{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		System.out.println("Is (0, 1.) inside c1? " + c1.isIn(0, 1));
		
		Circle c2 = new Circle(c1.getCenterX(), 2, 2.5);
		System.out.println(c2);
		System.out.println("c2's area: "+ c2.area());
		System.out.println("c2's perimeter: " + c2.perimeter());
		c2.moveTo(3, 4);
		c2.resize(2);
		System.out.println("Is (2, 2.5) inside c2? " + c2.isIn(2, 2.5));
	}
}