public class SavingsAccount extends BankAccount {
    private double minBalance;

    public SavingsAccount(String accountNumber, double balance, double minBalance) {
        super(accountNumber, balance, "Savings");
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds to maintain minimum balance");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{AccountNumber='" + getAccountNumber() + "', Balance=" + getBalance() + ", MinBalance=" + minBalance + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SavingsAccount account = (SavingsAccount) obj;
        return getAccountNumber().equals(account.getAccountNumber());
    }

    @Override
    public int hashCode() {
        return getAccountNumber().hashCode();
    }
}
