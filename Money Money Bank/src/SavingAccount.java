//savingaccount class
public class SavingAccount 
{
	private static int AccountNumber;
	private String Name;
	private double Balance;
	
	public void Deposit(double Amount)//member function for deposit
	{
		Balance+=Amount;
	}
	
	public void Withdraw(double Amount)//member function for withdraw
	{
		double balance=Balance;
		balance-=Amount;
		if(balance>0)
		{
		Balance-=Amount;
		}
	}

	public SavingAccount()//constructor
	{
		super();
		Name = null;
		Balance = 0;
	}

	public static int getAccountNumber()//getter
	{
		return AccountNumber;
	}

	public static void setAccountNumber()//setter
	{
		AccountNumber += 1;
	}

	public String getName()//getter
	{
		return Name;
	}

	public void setName(String name)//setter
	{
		Name = name;
	}

	public double getBalance() //getter 
	{
		return Balance;
	}

	public void setBalance(double balance)//setter
	{
		Balance = balance;
	}
	
	
}
