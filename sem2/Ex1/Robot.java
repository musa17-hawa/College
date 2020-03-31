//Author: Musa Abu Al-hawa

// initiating The robot Base class
public class Robot{
	//initilazing its variables
	private String name;
	private int positionX;
	private int positionY;
	private int facing;
	public final static int NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4;
	public Robot(){}// empty constructor
	public Robot(String name){//a contractor to creat a basic object with only name
		this.name = name;
		this.positionX = 0;
		this.positionY = 0;
		this.facing = NORTH;
	}
	public Robot(String name, int positionX, int positionY, int facing){
		// a constructor that check wether the given paremeters are correct and puts
		// the arguments into the Object variables
		this.name = name;
		if(facing > 0 && facing < 5){
			this.facing = facing;
		}
		else if (facing < 1 || facing > 4){//because facing = 0 or facing = 5 do not exist, if so, we replace it with 1:NORTH
			this.facing = NORTH;
		}

		if(positionX > 0){
			this.positionX = positionX;
		}
		else if(positionX < 0){// X position cant be negative, if so, we replace it with 0
			this.positionX = 0;
		}
		if(positionY > 0){
			this.positionY = positionY;
		}
		else if(this.positionY < 0){// Y position cannot be negative, if so, we replace it with 0
			this.positionY = 0;
		}
	}
	// getters return the value of the variables
	public String getName(){
		return this.name;
	}
	public int getPositionX(){
		return this.positionX;
	}
	public int getPositionY(){
		return this.positionY;
	}
	public int getFacing(){
		return this.facing;
	}

	public void move(){// this method makes the robot move only one step to whatever direction he is facing.
					   // making sure that if the robot is at 0 X and facing WEST, he cannot make the move
					   // because that will make the robot be in a negative X position which is prohibted
		if(this.facing == NORTH){
			this.positionY+=1;
		}
		else if(this.facing == EAST){
			this.positionX+=1;
		}
		else if(this.facing == SOUTH){
			if(this.positionY >= 1) this.positionY-=1;
		}
		else if(this.facing == WEST){
			if(this.positionX >= 1) this.positionX-=1;
		}
	}
	public void turnLeft(){// this method will make the robot turn 90 degrees to the left when calling upon
		// the turning are being done according to the current facing position of the robot
		if(this.facing == NORTH){
			this.facing = WEST;
		}
		else if(this.facing == EAST){
			this.facing = NORTH;
		}
		else if(this.facing == SOUTH){
			this.facing = EAST;
		}
		else if(this.facing == WEST){
			this.facing = SOUTH;
		}
	}
	public String toString(){// Standerd toString method which prints all of the variables of the Object that is calling this method
		String head = new String();
		if (this.facing == NORTH) head = "north";
		if (this.facing == EAST) head = "east";
		if (this.facing == SOUTH) head = "south";
		if (this.facing == WEST) head = "west";
		return "the robot " + this.name + " is at " + "("+this.positionX+", "+this.positionY+") and facing "+head;
	}
}