package ai.jobiak.services;

public interface AccountServices {

	public double getBalance(String accNo);
	public double withdraw(double amount);
	public double deposite(double amount);
	public boolean transfer(Account account,double amount);
}
