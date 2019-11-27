public class CarLot{
	private String name;
	private int carNum;
	private final int MAX = 100;
	private Car car1,car2,car3;

	public CarLot(String name){
		this.name = name;
		this.carNum = 0;
		this.car1 = null;
		this.car2 = null;
		this.car3 = null;

	}

	public void setName(String name){
		this.name = name;
	}
	public void setCarNum(int carNum){
		this.carNum = carNum;
	}
	public void setCar1(Car car){
		this.car1 = new Car(car);
	}
	public void setCar2(Car car){
		this.car2 = new Car(car);
	}
	public void setCar3(Car car){
		this.car3 = new Car(car);
	}

	public String getName(){
		return this.name;
	}
	public int getCarNum(){
		return this.carNum;
	}
	public Car getCar1(){
		return this.car1;
	}
	public Car getCar2(){
		return this.car2;
	}
	public Car getCar3(){
		return this.car3;
	}

	public boolean addCar(Car car){
		if (this.carNum < MAX){
			if (this.car1 == null){
				this.car1 = new Car(car);
				this.carNum+=1;
				return true;
			}
			else if (this.car2 == null) {
				this.car2 = new Car(car);
				this.carNum+=1;
				return true;
			}
			else if (this.car3 == null) {
				this.car3 = new Car(car);
				this.carNum+=1;
				return true;
			}
		}
		return false;
	}
	public void driveAll(){
		if (this.car1 != null){
			this.car1.drive(1000);
		}
		else if (this.car2 != null) {
			this.car2.drive(1000);
		}
		else if (this.car3 != null) {
			this.car3.drive(1000);
		}
	}
	public int restToAdd(){
		return this.MAX - this.carNum;
	}

	public boolean lowKm(Car car){
		return (this.car1 != null && this.car1.isLowKm(car)) || (this.car2 != null && this.car2.isLowKm(car)) || (this.car3 != null && this.car3.isLowKm(car));

	}

	public String toString(){
		
		return this.name+" has "+this.carNum+"\n"+this.car1.toString()+"\n"+this.car2.toString()+"\n"+this.car3.toString();
	}

}