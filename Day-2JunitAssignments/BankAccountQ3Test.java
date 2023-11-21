package junit.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountQ3Test {

	@Test
	void test() {
		BankAccountQ3 b=new BankAccountQ3(10000);
		assertThrows(InsufficientFundsException.class,()->b.withdraw(120000, b));
	}

}