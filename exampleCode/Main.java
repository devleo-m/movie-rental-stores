package exampleCode;

import exampleCode.classes.RentalStore;

public class Main {
    public static void main(String[] args) {
        // Instantiate the rental store and start user interaction
        RentalStore rentalStore = new RentalStore();
        rentalStore.displayMenu();
    }
}