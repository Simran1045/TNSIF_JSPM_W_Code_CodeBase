package DayThirteen_Synchronization;

public interface Bank {
	
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=20000;
	//void deposit (int amt) throws DepositLimitException;
	void withdraw(int amt) throws InsufficientBalanceException;
	void deposit(int amt);
}
