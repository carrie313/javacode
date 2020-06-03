package exam03;

public class AccountMain {
	public static void main(String[] args) {
		
	Account a = new Account();
	a.deposit (200000);
	try {
		a.withdraw(300000);
	}catch (BalanceInsufficientException e) {
		e.printStackTrace();
		e.getMessage();
		System.out.println(e.getMessage());
	}
	}
	}

