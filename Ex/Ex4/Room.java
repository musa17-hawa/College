public class Room{
	private String type;
	private double area;


	public Room(String type, double area){
		this.type = type;
		this.area = (area < 0) ? 0 : area;
	}
	public Room(Room other){
		this.type = other.type;
		this.area = other.area;
	}


	public String getType(){
		return this.type;
	}
	public double getArea(){
		return this.area;
	}
	public void setType(String name){
		this.type = name;
	}
	public void setArea(double area){
		this.area = (area < 0) ? 0 : area;
	}
	public String toString(){
		return "Room type: "+this.type+", Area: "+this.area;
	}
}