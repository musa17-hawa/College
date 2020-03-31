//Author: Musa Abu Al-hawa

// the class MoreSpecialRobot inherits from its parent SpecialRobot class which is the child class of Robot class

public class MoreSpecialRobot extends SpecialRobot{
	// declaring a new variable called battery to this more special robot class
	private int battery;



	public MoreSpecialRobot(String name){
		// calling the parent name constructor
		super(name);
		// puting the value of 100 in the battery variable(fully charged)(100%)
		this.battery = 100;
	}

	public MoreSpecialRobot(String name, int positionX, int positionY, int facing){
		// calling the parent(SpecialRobot) all arguments constructor
		// which calles its parent(Robot) constructor
		super(name,positionX,positionY,facing);
		// putting the battery value
		this.battery = 100;
	}

	//getters

	public int getBattery(){
		return this.battery;
	}
	// toString that calles its parent to String and adding the battery to it
	// Overriding the toString Method
	// we call the parent to string and then add the battery percentage to it
	public String toString(){
		return super.toString()+" Battery is: " + battery +"%";
	}

	// for each move(step) the MoreSpecialRobot makes we have to decrease the battery percentage by 1%
	// if the robot cannot make the move, we do not decrease the value of the battery,
	// because the MoreSpecialRobot Object's position was not changed, thus Not making a move. Despite his try.
	public void move(){
		if(this.battery > 0){
			int head = super.getFacing();
			if(head == SOUTH && super.getPositionY() > 0){// checking if the move is possiable
				super.move();
				this.battery -= 1;
			}
			else if(head == WEST && super.getPositionX() > 0){// checking if the move is possiable
				super.move();
				this.battery -= 1;
			}
			else if(head == NORTH){// a robot can always move NORTH(+Y)
				super.move();
				this.battery -=1;
			}
			else if(head == EAST){// a robot can always move(EAST+)
				super.move();
				this.battery -=1;
			}
		}
	}
}