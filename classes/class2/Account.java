public class Account{
	public int num;
	public double balance, overdraftLimit;
	public boolean active;

	public void printAccountNumber(){
		System.out.println("Account Number is: "+num);
		}

	public void printDetails(){
		System.out.println("Account Number : "+num+ " balance: "+balance+" overdraftLimit "+ overdraftLimit+" , " +active);

	}

	public void deposit(double amount){
		balance += amount;
		System.out.println("current balance: "+balance);
	}

	
}