package exceptions.java;

class SavingsAccount{
	private long id;
	private double balance;
	
	public SavingsAccount(long id, double balance) {
		this.id=id;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount)throws InsufficientBalanceException, IllegalBankTransactionException {
		
		if(balance==0)
			throw new InsufficientBalanceException("There is no balance");
		else if(balance<amount)
			throw new InsufficientBalanceException("There is no sufficient balance");
		else if(amount < 0)
			throw new IllegalBankTransactionException("Enter valid amount");
		balance=balance-amount;
		return amount;
	}
	public double deposit (double amount) {
		balance=balance+amount;
		return balance;
	}
}

public class Exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savingAccount = new SavingsAccount(1, 2000);

        try {
            // Test withdrawing more than the balance
            double withdrawnAmount = savingAccount.withdraw(2100);
            System.out.println("Withdrawn Amount: " + withdrawnAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalBankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Test withdrawing a negative amount
            double withdrawnAmount = savingAccount.withdraw(-1000);
            System.out.println("Withdrawn Amount: " + withdrawnAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalBankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
