public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance, "Checking");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds, even with overdraft");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{AccountNumber='" + getAccountNumber() + "', Balance=" + getBalance() + ", OverdraftLimit=" + overdraftLimit + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CheckingAccount account = (CheckingAccount) obj;
        return getAccountNumber().equals(account.getAccountNumber());
    }

    @Override
    public int hashCode() {
        return getAccountNumber().hashCode();
    }
}
