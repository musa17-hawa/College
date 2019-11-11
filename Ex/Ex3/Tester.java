public class Tester{
	public static void main(String[] args) {

		Linear f = new Linear(2, 3);
		System.out.println(f);

		Linear l1 = new Linear(2, 4);
		System.out.println(l1);

		System.out.println(f.getA());
		System.out.println(f.getB());
		System.out.println(f.assign(10));
		System.out.println(f.solve(10));
		
		System.out.println(f.getIntersection(l1));

		System.out.println(f.isOnLine(10,10));
		System.out.println(f.isOnLine(-1,1));

		System.out.println(f.areParallel(l1));
		System.out.println(f.createLinear(1,3,2,4));
	
	}
}