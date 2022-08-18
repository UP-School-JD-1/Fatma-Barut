package account;

public class AccountTest {

	public static void main(String[] args) {
		AccountClient accountClient = new AccountClient();
		Account from = new Account();
		Account to = new Account();
		
		
		accountClient.withDraw(from, 50.0);
		accountClient.deposit(from, 100.0);
		accountClient.deposit(to, 100.0);
		accountClient.transfer(from, to, 100.0);

	}

}
