package BankingApplication;

import java.util.Scanner;

public class BankingApp {
	public static void main(String[] args)
	{
		
		Scanner ob=new Scanner(System.in);
		
		AccountServices accountservices=new AccountServices();
//		PaymentServices paymentservices=new PaymentServices();
		BankAccount savingAccount= new BankAccount();
		BankAccount currentAccount=new BankAccount();
		System.out.println("choose account type: 1 for Current, 2 for Saving");
		int choice=ob.nextInt();
		if(choice==1)
		{
			System.out.println("create current account:");
			accountservices.createAccount(currentAccount);
			accountservices.displayAccountDetails(currentAccount);
		}
		else if(choice==2)
		{
			System.out.println("create saving account");
			accountservices.createAccount(savingAccount);
			accountservices.displayAccountDetails(savingAccount);
		}
		System.out.println("choose type of transaction:1 for Deposit,2 for Withdrawal");
//		int choice1= ob.nextInt();
//		if(choice1==1)
//		{
//			System.out.println("Enter the amount to be deposited:");
//
//			double amount=ob.nextDouble();		
//			accountservices.deposit(amount);
//		}
//		else if(choice1==2)
//		{
//			System.out.println("Enter the amount to withdraw:");
//			double amount=ob.nextDouble();		
//			accountservices.withdraw(amount);
//		}
	
	
		ob.close();

		
	}

}
