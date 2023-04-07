public class Car{
	public int carNum;
	public int km;
	public boolean licence;
	public double fuel;
	public int capacity;
	public final int KM_LITER = 15;


	


	public int getCarNum(){
		return carNum;
	}

	public boolean getLicence(){
		return licence;
	}



	public void printCarNum(){
		System.out.println(carNum);

	}

	public String toString(){
		return "car number is: "+carNum+ ", car km is: " +km+", car licence is: "+licence+", car fuel is: "+fuel+", car capacity is: "+capacity+", car km per liter is: "+KM_LITER;
	}

	public void refuel(double fuelAmount){
		if (fuelAmount > 0 && this.fuel + fuelAmount < this.capacity){
			this.fuel+=fuelAmount;

		}
		

	}

	public void drive(int km){
		this.km+=km;
		this.fuel-=(km/KM_LITER);
	}

	public boolean canMakeIt(int km){
		if (km > KM_LITER*this.fuel){
			return false ;
		}
		else{
			return true ;
		}
	}
}

	
