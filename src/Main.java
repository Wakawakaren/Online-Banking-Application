public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("C001", "Alice", "123 Main St", "123-456-7890");

        // Create bank accounts
        BankAccount account1 = new BankAccount("A001", 1000.0, "Savings");

        // Create a bank
        Bank bank = new Bank("MyBank", "BR001");

        // Add customers and accounts to the bank
        bank.addCustomer(customer1);
        bank.addAccount(account1);

        // Perform operations
        account1.deposit(200);
        account1.withdraw(100);

        // Display customer and account details
        customer1.displayCustomerInfo();
        account1.displayAccountDetails();

        // List all accounts
        bank.listAccounts();
    }
}
