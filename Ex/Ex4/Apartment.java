public class Apartment{
	// initiating Apartment variables(characteristics)
	private String family;
	private int flat;
	private Room firstRoom;
	private Room secondRoom;
	private Room thirdRoom;
	private int numOfRooms;

	// Apartment constructor that takes the name of the family
	// and the floor of the flat(apartment) as parameters
	public Apartment(String name, int flat){
		// we put the parameters into the object characteristics
		this.family = name;
		this.flat = (flat < 0) ? 0 : flat; // we check if the flat floor(level)
										   // if so then we put 0 as the floor characteristic
										   // if not(less than zero) then we put the flat parameter
										   // in the flat object characteristic
		this.firstRoom = null; // null here means that there is no room object(no room)
		this.secondRoom = null;
		this.thirdRoom = null;
		this.numOfRooms = 0; // the number of the rooms is 0 because there isnt any room
	}

	// Getters
	public String getFamily(){
		return family;
	}
	public int getFlat(){
		return flat;
	}
	public int getNumOfRooms(){
		return numOfRooms;
	}
	// the setRoom method basically appends a room into the apartment object
	public void setRoom(Room r){
		// first we need to check if there are less than 3 rooms in the apartment
		// because the maximum number of rooms in one apartment is 3 rooms
		// then we need to know which one of the
		// rooms(Apartment Object room characteristic) is empty
		// if we find any empty(null) room we put it
		// then we add 1 to the number of rooms in the Apartment object
		// because we add a room into the Apartment object
		if (this.numOfRooms < 3){
			if (this.firstRoom == null){
				this.firstRoom = new Room(r);
				this.numOfRooms+=1;
			}
			else if (this.secondRoom == null) {
				this.secondRoom = new Room(r);
				this.numOfRooms+=1;
			}
			else if (this.thirdRoom == null) {
				this.thirdRoom = new Room(r);
				this.numOfRooms+=1;
			}
		}
	}
	// we need to have the sum of all 3 rooms in one Apartment object
	// if the Apartment hasnt any of the rooms we cant add null to a number
	// so we check if the room is empty(null)
	// if so then we say that the area for this room is 0
	// if not(!null) we get the area of that room(getArea())
	// and then puts it into the variable 
	public double getTotalArea(){
		// initiating rooms area variables
		double firstRoomArea;
		double secondRoomArea;
		double thirdRoomArea;
		// doing the checking (empty or not) and putting the values
		firstRoomArea = (this.firstRoom == null) ? 0 : this.firstRoom.getArea();
		secondRoomArea = (this.secondRoom == null) ? 0 : this.secondRoom.getArea();
		thirdRoomArea = (this.thirdRoom == null) ? 0 : this.thirdRoom.getArea();
		// returning the Sum of all areas
		return firstRoomArea + secondRoomArea + thirdRoomArea;
	}
	// the getRoomByType method takes a String "type" as a parameter
	// and then looks for this "type" of room in the needed Apartment object
	// But, we cant get the type of a null room // errors
	// so that means we have to check if the room is not empty(!null)
	// if its not empty(!null) then check the room type(getType)
	// if its the same as the given type(parameter)
	// then return this room(Room Object)
	// if none of the rooms are the same type as the parameter
	// then return null
	public Room getRoomByType(String type){
		if (this.firstRoom != null && this.firstRoom.getType() == type){
			return this.firstRoom;
		}
		else if (this.secondRoom != null && this.secondRoom.getType() == type) {
			return this.secondRoom;
		}
		else if (this.thirdRoom != null && this.thirdRoom.getType() == type) {
			return this.thirdRoom;
		}
		return null;
	}
	// toString method returns the object as a string with all its details
	// BUT if one or more of the rooms are empty(null)
	// then we dont need to print its/their details

	public String toString(){
		// details String variable is the final answer
		String details = this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\n";

		if (this.firstRoom != null){ // if the first room isnt empty
			// add its details to details(final answer)
			// here we use the toString method of the Room class
			details+=this.firstRoom.toString();
		}
		// doing the same thing for the rest of the rooms
		if(this.secondRoom != null){
			details+=this.secondRoom.toString();
		}
		if(this.thirdRoom != null){
			details+=this.thirdRoom.toString();
		}
		// returning the details of the apartment
		return details;
	}
}
