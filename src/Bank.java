import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String branchCode;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank(String bankName, String branchCode) {
        this.bankName = bankName;
        this.branchCode = branchCode;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void listAccounts() {
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }
}
