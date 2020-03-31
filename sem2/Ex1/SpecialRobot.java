//Author: Musa Abu Al-hawa

// SpecialRobot class inherits from the parent Robot class
public class SpecialRobot extends Robot{
	public SpecialRobot(String name){
		super(name); // calling the parent class constructor to initiate the object
	}
	public SpecialRobot(String name, int positionX, int positionY, int facing){
		// here we dont have to check if the arguments are correct because in the next line
		// we are calling the parent class constructor which there we check wether the arguments
		// are correct, if so, an Object will be made with the given arguments, if not
		// the constructor will put the defualt values accordingly
		// (0) For X
		// (0) For Y
		// (NORTH/1) for facing
		super(name, positionX, positionY, facing);
	}
	// a method that makes the robot turn right 90 degrees,
	public void turnRight(){
	// since we dont have access to the facing variable(declared as privet in parent class)
	// and since we cant make a setter for the facing variable,
	// this uneffeciant way of turning right is being used in order to complete the operation
	// which i personally dont think that is a good solution, but we are forced to do so.
	// turning left 3 times makes us in the position where if we have tuned right we would be.
		for(int i = 0; i < 3;i++){
			this.turnLeft();
		}
	}
	// to String method 
	public String toString(){
		return super.toString();
	}
}