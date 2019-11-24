public class Tester{
	public static void main(String[] args) {
		Room r1 = new Room("Kitchen", 10);
        System.out.println(r1);

        Apartment ap = new Apartment("Cohen", 1);
        System.out.println(ap);


        Room r2 = ap.getRoomByType("Kitchen");
        if(r2 == null){
            System.out.println("No Kitchen yet");
        }
        else{
            System.out.println("Kitchen found");
        }


        ap.setRoom(r1); //ap has the room r1 which is a kitchen
        r2 = ap.getRoomByType("Kitchen"); // r2 is Room "kitchen"

        if(r2 == null){
            System.out.println("No Kitchen yet");
        }
        else{
            System.out.println("Kitchen found"); 
        }


        System.out.println("Checking aliasing:");
        r1.setType("Living Room"); // r1 is Room "living room"
        r2 = ap.getRoomByType("Living Room"); // r2 = ap.firstRoom.getType() = Kitchen
        r3 = 

         if(r2 == null){
            System.out.println("Great - no aliasing here");
        }
        else{
            System.out.println("Too bad - aliasing effect");
        }


        System.out.println(ap);
        ap.setRoom(new Room("Living Room", 20));
        ap.setRoom(new Room("Bathroom", 5));
        System.out.println("After adding 2 more rooms:");
        System.out.println(ap);
        System.out.println("Total area: " + ap.getTotalArea());
	}
}