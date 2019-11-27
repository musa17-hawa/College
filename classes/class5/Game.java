public class Game{
	private int num;
	private final int DIGITS = 4;
	public static final VICTORY = 4; // static says its a class variable and not object variable

	public Game(){
		int n;
		do{
			n = (int)(Math.random()*Math.pow(10, DIGITS));
		}while(!isValid(n));
		
		this.num = n;
	}

	public static boolean isValid(int n){
		if (n >= Math.pow(10*DIGITS)){
			return false;
		}

	}
}