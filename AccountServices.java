package BankingApplication;

import java.util.Scanner;

public class AccountServices implements Bankoperations {

public void createAccount(BankAccount account)
{
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter Account Number: ");
	account.setAccountNumber(ob.nextLine());
	
	System.out.println("Enter Account Holder Name: ");
	account.setAccountHolderName(ob.nextLine());
	
	System.out.println("Enter Branch: ");
	account.setBranch(ob.nextLine());
	
	System.out.println("Enter Balance:");
	account.setBalance(ob.nextDouble());
	
	System.out.println("Enter Country");
	account.setCountry(ob.next());
	
	
	System.out.println("Account created successfully");
	ob.close();
	
}
public void displayAccountDetails(BankAccount  account)
{
	System.out.println("\nAccount Details:");
	System.out.println("Account Number"+ account.getAccountNumber());
	System.out.println("AccountHolder: "+account.getAccountHolderName());
	System.out.println("Branch: "+account.getBranch());
	System.out.println("Country: "+account.getCountry());
	System.out.println("Balance: ₹"+account.getBalance());
}
@Override
public void deposit(double amount) {
	double balance = 0;
	
	 if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
	
}
@Override
public void withdraw(double amount) {
	
	double balance = 0;
	
	if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    } else {
        System.out.println("Insufficient balance or invalid amount.");
    }
	
}


	
}

