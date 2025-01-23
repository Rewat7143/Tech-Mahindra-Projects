package customercount;

import java.util.Scanner;

public class Saloon {
    private String name;
    private int customerCount;

    // Constructor
    public Saloon(String name) {
        this.name = name;
        this.customerCount = 0;
    }

    // Add a customer to the saloon
    public void addCustomer() {
        customerCount++;
    }

    // Get the customer count for this saloon
    public int getCustomerCount() {
        return customerCount;
    }

    // Get the saloon name
    public String getName() {
        return name;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create saloons
        Saloon saloon1 = new Saloon("Saloon 1");
        Saloon saloon2 = new Saloon("Saloon 2");

        // Create customers (dynamic interaction)
        System.out.println("Welcome to the Saloon Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a customer to Saloon 1");
            System.out.println("2. Add a customer to Saloon 2");
            System.out.println("3. Display customer counts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    saloon1.addCustomer();
                    System.out.println("A customer has been added to Saloon 1.");
                    break;
                case 2:
                    saloon2.addCustomer();
                    System.out.println("A customer has been added to Saloon 2.");
                    break;
                case 3:
                    System.out.println(saloon1.getName() + " has " + saloon1.getCustomerCount() + " customers.");
                    System.out.println(saloon2.getName() + " has " + saloon2.getCustomerCount() + " customers.");
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
