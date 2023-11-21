package oops.java;

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateTotalCash() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double fixedDeposit;

    public SavingsAccount(double balance, double fixedDeposit) {
        super(balance);
        this.fixedDeposit = fixedDeposit;
    }

    @Override
    public double calculateTotalCash() {
        // Override the method to include fixed deposits for savings account
        return super.calculateTotalCash() + fixedDeposit;
    }
}

class CurrentAccount extends Account {
    private double cashCredit;

    public CurrentAccount(double balance, double cashCredit) {
        super(balance);
        this.cashCredit = cashCredit;
    }

    @Override
    public double calculateTotalCash() {
        // Override the method to include cash credit for current account
        return super.calculateTotalCash() + cashCredit;
    }
}

public class BankingSystem_3 {
    public static void main(String[] args) {
        // Create instances of different accounts
        Account account1 = new SavingsAccount(50000, 10000);
        Account account2 = new CurrentAccount(30000, 5000);
        Account account3 = new SavingsAccount(55000, 12000);

        // Calculate and display the total cash in the bank
        double totalBankCash = account1.calculateTotalCash()+account2.calculateTotalCash()+account3.calculateTotalCash();
        System.out.println("Total Cash in the Bank: $" + totalBankCash);
    }
}

