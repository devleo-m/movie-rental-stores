package exampleCode.classes;

import java.util.ArrayList;
import java.util.List;

import exampleCode.interfaces.UserInterface;

public class RentalStore implements UserInterface {
    private List<Movie> movies;
    private List<Customer> customers;

    public RentalStore() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
    }

    // Implementation of interface methods
    @Override
    public void displayMenu() {
        // Implementation of menu
    }

    @Override
    public void registerMovie() {
        // Implementation of movie registration
    }

    @Override
    public void queryMovies() {
        // Implementation of movie query
    }

    @Override
    public void reserveMovie() {
        // Implementation of movie reservation
    }

    @Override
    public void rentMovie() {
        // Implementation of movie rental
    }

    @Override
    public void returnMovie() {
        // Implementation of movie return
    }

    @Override
    public void registerCustomer() {
        // Implementation of customer registration
    }

    @Override
    public void queryCustomers() {
        // Implementation of customer query
    }

    @Override
    public void generateReports() {
        // Implementation of report generation
    }

    // Other necessary methods for store management
}
