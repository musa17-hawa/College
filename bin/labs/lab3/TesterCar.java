import java.util.Scanner;
public class TesterCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
//		Car c = new Car ();
//		c.capacity=40;
//		c.carNum=123456;
//		c.fuel=10;
//		c.isTest=true;
//		c.km=0;
//		c.printDetails();		//40,123456,10.0,true,0
//		c.refuel(20);
//		c.printDetails();       //40,123456,30.0,true,0
//		System.out.println("please enter km to drive");
//		int distance= scan.nextInt();
//      c.drive(distance); //drove ___ km to jerusalem	
//		c.printDetails();	//40,123456,25.0,true,50
		
		//second lesson 13/11/2019
		
		Car c= new Car();
		System.out.println(c);//40,1111111,10.0,false,0		
		Car bmw= new Car(3435567, 40);//40,3435567,40.0,true,0
		System.out.println(bmw);  
		
		boolean ans =bmw.getTest();
		if (ans)//==true
			System.out.println("you have test");
		else
			System.out.println("no test!");
		bmw.setTest(false);
		System.out.println(bmw.toString());//40,3435567,40.0,false,0
		
		
		c.drive(100000);
		
		boolean ans2= bmw.getTest();
		System.out.println(ans);//true
		bmw.setTest(false);
		
		System.out.println(bmw.betterKm(c));//3456636   3435567

		Car carBmw = new Car();
		Car carFord = new Car(123456,40);
		carBmw.setTest(true);
		carFord.printCarNum();
		System.out.println(carFord);
		if (carBmw.getFuel()  > carFord.getFuel()){
			carBmw.printCarNum();
		}
		else{
			carFord.printCarNum();
		}

		System.out.println(carBmw.betterKm(carFord));

		CarLot cl = new CarLot("Musa");
		cl.addCar(carBmw);
		cl.addCar(carFord);
		System.out.println(cl.restToAdd());
		cl.driveAll();
		System.out.println(cl);
		System.out.println(cl.getCar1().getKm());
		System.out.println(cl.getCar2().getKm());
		System.out.println(cl.getCar3().getKm());
	}
}
