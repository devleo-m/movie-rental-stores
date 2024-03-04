package exampleCode.classes;

public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getters for accessing attributes
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
