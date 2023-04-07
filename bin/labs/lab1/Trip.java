import java.util.Scanner;

public class Trip {
	public static void main(String[] args) {
		int busNum, pplInLastBus;
		Scanner usrIn = new Scanner(System.in);
		
		System.out.println("How many people are going to the trip?: ");
		int numOfPpl = usrIn.nextInt();
		
		System.out.println("How many people are going to be in each bus?: ");
		int busSeat = usrIn.nextInt();
		
		if (numOfPpl%busSeat == 0) {
			busNum = (numOfPpl/busSeat);
		}
		
		else {
			busNum = (numOfPpl/busSeat)+1;
		}
		
		pplInLastBus = (numOfPpl%busSeat);
		
	
		System.out.println("Ther are "+busNum+" buses");
		System.out.println("There are "+pplInLastBus+" in the last bus");
	}
}
