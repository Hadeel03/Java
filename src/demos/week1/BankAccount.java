package demos.week1;

public class BankAccount
{
	private double balance; 
	
	public BankAccount()
	{
		balance = 0;
	}
	
	public BankAccount(double initialBalance) 
	{
		balance = initialBalance;
	}
	
	public void deposite(double amount)
	{
		balance += amount;
	}
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	public double getBalannce()
	{
		return balance; 
	}
	
	public static void main(String[] args)
	{
		BankAccount harrysChecking = new BankAccount();
		BankAccount momsSavings = new BankAccount(2000);
		
		// transfer:
		double transfer = 500;
		momsSavings.withdraw(500);
		harrysChecking.deposite(500);
		
		System.out.println("Harry's balance: " + harrysChecking.getBalannce());
		System.out.println("Mom's balance: " + momsSavings.getBalannce());
		
		// add interest: 
		double interestRate = 5;
		double interestAmount = momsSavings.getBalannce() * interestRate / 100;
		momsSavings.deposite(interestAmount);
		
		BankAccount emilysChecking = new BankAccount(500000);
		double bal = emilysChecking.getBalannce();
		emilysChecking.withdraw(bal);
	}
}
