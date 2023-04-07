public class TesterCar{

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.carNum = 1234567;
		c1.km = 123456;
		c1.licence = true;
		c1.fuel = 2;
		c1.capacity = 100;

		c1.refuel(100);
		
		System.out.println(c1);
		System.out.println(c1.canMakeIt(120));
	}
}