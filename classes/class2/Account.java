public class Account{
	public int num;
	public double balance, overdraftLimit;
	public boolean active;

	public Account(){
		num = (int)(Math.random()*1000);
		balance = overdraftLimit = 0.0;
		active = true;

	}

	public void printAccountNumber(){
		System.out.println("Account Number is: "+num);
		}

	public String toString(){
		return "Account Number : "+num+ ", balance: "+balance+", overdraftLimit "+ overdraftLimit+", " +"status : "+active ;

	}

	public void deposit(double amount){
		balance += amount;
		System.out.println("current balance: "+balance);
	}

	public double howMuchToWithdraw(){

		return balance - overdraftLimit;

	}



	
}