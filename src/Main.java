public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("C001", "Alice", "123 Main St", "123-456-7890");
        Customer customer2 = new Customer("C002", "Bob", "456 Elm St", "987-654-3210");

        // Create bank accounts
        BankAccount account1 = new BankAccount("A001", 1200.0, "Savings");
        SavingsAccount savingsAccount = new SavingsAccount("A002", 1000.0, 100.0);
        CheckingAccount checkingAccount = new CheckingAccount("A003", 500.0, 200.0);

        // Create a bank
        Bank bank = new Bank("MyBank", "BR001");

        // Add customers and accounts to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addAccount(account1);
        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        // Perform operations on accounts
        account1.deposit(200);
        account1.withdraw(100);
        savingsAccount.deposit(300);
        checkingAccount.withdraw(600);

        // Display customer and account details
        System.out.println("Customer Details:");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

        System.out.println("\nAccount Details:");
        bank.listAccounts();

        // Sort customers by name
        System.out.println("\nSorted Customers:");
        bank.sortCustomersByName();
        for (Customer customer : bank.getCustomers()) {
            System.out.println(customer);
        }

        // Search for an account by customer ID
        System.out.println("\nSearch for Account:");
        System.out.println(bank.searchCustomerById("C002"));

        // Filter accounts by balance
        System.out.println("\nFiltered Accounts:");
        bank.filterAccountsByBalance(900.0);
    }
}
