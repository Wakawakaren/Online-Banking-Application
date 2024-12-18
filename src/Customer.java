public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phone;

    public Customer(String customerId, String name, String address, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}
