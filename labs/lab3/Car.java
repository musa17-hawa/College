
//13.11.2019

public class Car {
	//attributes/ data members
	private int km,carNum,capacity;
	private double fuel;
	private boolean isTest;
	final int KM_LITRE=10;
	
	// constructors
	//constructors 
	public Car(int carNum,int capacity) {
		km=0;
		this.carNum=carNum;
		this.capacity=capacity;
		if (capacity<0)
			this.capacity= capacity *-1;
		this.fuel =this.capacity;
		this.isTest=true;
		
	}
	//default constructor
	public Car()
	{
		this.capacity=40;
		this.carNum=1111111;
		this.fuel=10;
		this.km=0;
		this.isTest=false;
	}

	public Car(Car other){

		this.capacity=other.capacity;
		this.carNum=other.carNum;
		this.fuel=other.fuel;
		this.km=other.km;
		this.isTest=other.isTest;
	}
	public boolean getTest()
	{
		return this.isTest;
	}
	public double getKm(){
		return this.km;
	}

	public double getFuel(){
		return this.fuel;
	}
	public void setTest(boolean isT)
	{
		this.isTest = isT;
	}
	//printing methods
	public void printCarNum() {
		System.out.println("the car number is" +carNum);
	}
	
	// the method refuels the car by given amount
	public void refuel(double amount)
	{
		if (fuel+amount<=capacity && amount>0)
			fuel = fuel+amount;
	}
	//the method drives he car kmDrove.therefor changes the fuel and km attributes.
	public void drive (double kmDrove)
	{
		fuel -= kmDrove/KM_LITRE;
		km += kmDrove;
		
	}
	public boolean canMakeIt (double kilometer)
	{
		if (kilometer/KM_LITRE> fuel)//not enough fuel
			return false;
		return true;
	}
	
	public int betterKm(Car other)
	{
		if (this.km<other.km)
			return this.carNum;
		return other.carNum;
	}
	

	public boolean isLowKm(Car other){
		return this.km < other.km;
	}

	public String toString() {
		return (capacity +","+carNum+","+fuel+","+isTest+","+km);

		}
	
	
}