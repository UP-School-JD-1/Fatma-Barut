package account;

public class AccountClient {
	double amount;
	double transferCost;

	public void withDraw(Account account, double amount) {
		if (amount > account.getBalance() ) {
			System.out.println("Insufficient Balance");
			return;
		}
		System.out.println(amount + "TL has been drawn successfully");
	}

	 public void deposit(Account account, double amount) {
		 System.out.println(amount + "TL has been deposited successfully");
		 return;
	 }
	 
	 public void transfer(Account from, Account to, double account) {
		 if(from.getBalance()< (amount + transferCost)){
		 System.out.println("Insufficient Balance");
		 return;
	 }
	 
	 System.out.println(amount + "TL has been transferred successfully");
	 
	 }
	 


}
