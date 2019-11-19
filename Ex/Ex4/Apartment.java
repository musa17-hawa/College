public class Apartment{
	private String family;
	private int flat;
	private Room firstRoom;
	private Room secondRoom;
	private Room thirdRoom;
	private int numOfRooms;


	public Apartment(String name, int flat){
		this.family = name;
		this.flat = (flat < 0) ? 0 : flat;
		this.firstRoom = null;
		this.secondRoom = null;
		this.thirdRoom = null;
		this.numOfRooms = 0;
	}


	public String getFamily(){
		return family;
	}
	public int getFlat(){
		return flat;
	}
	public int getNumOfRooms(){
		return numOfRooms;
	}
	public void setRoom(Room r){
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
	public double getTotalArea(){
		double firstRoomArea;
		double secondRoomArea;
		double thirdRoomArea;

		firstRoomArea = (this.firstRoom == null) ? 0 : this.firstRoom.getArea();
		secondRoomArea = (this.secondRoom == null) ? 0 : this.secondRoom.getArea();
		thirdRoomArea = (this.thirdRoom == null) ? 0 : this.thirdRoom.getArea();

		return firstRoomArea + secondRoomArea + thirdRoomArea;
	}
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
	public String toString(){
		if (this.numOfRooms == 1){
			if (this.firstRoom != null){
				return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.firstRoom.getType()+", Area: "+this.firstRoom.getArea();
			}
			else if (this.secondRoom != null) {
				return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.secondRoom.getType()+", Area: "+this.secondRoom.getArea();
			}
			else if (this.thirdRoom != null) {
				return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.thirdRoom.getType()+", Area: "+this.thirdRoom.getArea();
			}
		}
		else if (this.numOfRooms == 2){
			if (this.firstRoom != null && this.secondRoom != null) {
				return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.firstRoom.getType()+", Area: "+this.firstRoom.getArea()+"\nRoom type: "+this.secondRoom.getType()+", Area: "+this.secondRoom.getArea();
			}
			else if (this.firstRoom != null && this.thirdRoom != null) {
				return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.firstRoom.getType()+", Area: "+this.firstRoom.getArea()+"\nRoom type: "+this.thirdRoom.getType()+", Area: "+this.thirdRoom.getArea();
			}
			else if (this.secondRoom  != null && this.thirdRoom != null){
				return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.secondRoom.getType()+", Area: "+this.secondRoom.getArea()+"\nRoom type: "+this.thirdRoom.getType()+", Area: "+this.thirdRoom.getArea();
			}

		}
		else if (this.numOfRooms == 3){
			return this.family+"'s apartment, flat "+this.flat+" has "+this.numOfRooms+" rooms\nRoom type: "+this.firstRoom.getType()+", Area: "+this.firstRoom.getArea()+"\nRoom type: "+this.secondRoom.getType()+", Area: "+this.secondRoom.getArea()+"\nRoom type: "+this.thirdRoom.getType()+", Area: "+this.thirdRoom.getArea();
		}
		return this.family+"'s apartment, flat "+this.flat+" has 0 rooms";
	}
}