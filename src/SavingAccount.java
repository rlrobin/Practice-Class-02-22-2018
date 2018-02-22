
public class SavingAccount {
	String username;
	int pin;
	double balance;
	
	public SavingAccount(String username1, int pin1, double balance1)
	{
		username=username1;
		pin=pin1;
		balance=balance1;
	}
	public double withdraw ( double With )
	{
		double amount = (balance-With);
		return amount;
	}
	
	public double deposit( double Depo)
	{
		double amount = (balance+Depo);
		return amount;
	}
}
