package ai.jobiak.services;

public class BankOfAndra {

	public static void main(String[] args) {
		
		Account account=new Account("101S","Akhila",5000);
		Account account1=new Account("101F","Akhila",45000);
		Account account2=new Account("101v","Akhila",95000);
		
		AccountServices service=account;
		double result=service.deposite(20000);
		System.out.println(result);
		
		service=account1;
		result=account1.withdraw(2000);
		System.out.println(result);
		
		service=account2;
		boolean success=account2.transfer(account1, 4000);
		System.out.println(success);
		System.out.println(account1.getFullName()+"$"+account1.getBalance());
		System.out.println(account2.getFullName()+"$"+account2.getBalance());
	}

}
