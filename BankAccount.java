package BankingApplication;

public class BankAccount {
  private String accountNumber;
  private String accountHolderName;
  private double balance;
  private String branch;
  private String country;
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
