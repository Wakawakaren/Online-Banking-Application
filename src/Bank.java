import java.util.ArrayList;
import java.util.Comparator;
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
            System.out.println(account);
        }
    }

    public void sortCustomersByName() {
        customers.sort(Comparator.comparing(Customer::toString));
    }

    public Customer searchCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.toString().contains(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void filterAccountsByBalance(double minBalance) {
        for (BankAccount account : accounts) {
            if (account.getBalance() > minBalance) {
                System.out.println(account);
            }
        }
    }

    // Getter for customers list
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
