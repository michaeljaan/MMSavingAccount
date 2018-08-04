//SavingAccount main function 
import java.util.Scanner;
public class SavingAccMain 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		SavingAccount Savingaccount=new SavingAccount();//object creation
		Savingaccount.setAccountNumber();//initializing acc number
		
		double balance;//local variables
		String name;
		int accno;
		
		System.out.print("Enter the name:");
		name=scanner.nextLine();//enter the name
		Savingaccount.setName(name);
		
		System.out.println("Enter Initial deposit in account:");
		balance=scanner.nextDouble();
		Savingaccount.setBalance(balance);//input initial balance
		
		System.out.println("Enter 1 for deposit. 2 for withdrawal:");
		int state=scanner.nextInt();//select operation
		
		if(state==1)//deposir
		{
			System.out.println("Enter The amount to be deposit:");
			balance=scanner.nextDouble();
			Savingaccount.Deposit(balance);//invoking deposit object function
		}
		else if(state==2)
		{
			System.out.println("Enter The amount to be withdrawn:");
			balance=scanner.nextDouble();
			Savingaccount.Withdraw(balance);//invoking withdraw object function
		}
		
		//System.out.println("Enter Account holder Name");
		//name=scanner.nextLine();
		System.out.println("Enter Account Number:");//to get account details enter acc number
		accno=scanner.nextInt();
		if(accno==Savingaccount.getAccountNumber())//compare acc number with entered number
		{
			//if(name==Savingaccount.getName())
			{
				System.out.println("Account details:");//display acc details
				System.out.println("Account number:"+Savingaccount.getAccountNumber());
				System.out.println("Account name:"+Savingaccount.getName());
				System.out.println("Balance:"+Savingaccount.getBalance());
			}
		}
		

	}

}
