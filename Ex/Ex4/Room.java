public class Room{ // a new Room class
	private String type; // type string variable
	private double area; // area double(decimel number) variable

	// Room constructor that takes the (type, area) of the room as parameters
	public Room(String type, double area){
		this.type = type;
		// checking if the area parameter is less than zero
		this.area = (area < 0) ? 0 : area; // if so then we put 0 in the objects area variable
	}									   // if not then we put the parameter area into the objects area variable
	// Room Copy Constructor
	// here we dont need to check the area because it this copy constructor
	// takes a valid Room object as a parameter
	public Room(Room other){
		this.type = other.type;
		this.area = other.area;
	}

	//getters and setters
	public String getType(){
		return this.type;
	}
	public double getArea(){
		return this.area;
	}
	public void setType(String name){
		this.type = name;
	}
	public void setArea(double area){ // not requird for Ex4 but did it anyway
		// doing the same checking for the area

		this.area = (area < 0) ? 0 : area;
	}
	public String toString(){ // return the object as a string with all its details
		return "Room type: "+this.type+", Area: "+this.area+"\n";
	}
}