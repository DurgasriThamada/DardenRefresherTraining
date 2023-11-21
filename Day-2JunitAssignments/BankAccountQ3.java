package junit.java;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException() {
		super();
	}
}
public class BankAccountQ3 {
	private  int balance;
	public BankAccountQ3(int balance) {
		super();
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount, BankAccountQ3 b) throws InsufficientFundsException {
		if(b.getBalance()>=amount) {
			b.setBalance(b.getBalance()-amount);
		}
		else {
			throw new InsufficientFundsException();
		}
	}
	public static void main(String[] args) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		BankAccountQ3 b=new BankAccountQ3(10000);
		b.withdraw(12000,b);
	}

}