package InterfaceExample;

import java.util.Scanner;

public class Customer {
    DMart section;

    public void chooseSection(DMart section) {
        this.section = section;
    }

    public void shopping() {
        section.shopping();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer();

        System.out.println("Welcome to DMart!");
        System.out.println("Please choose a section:");
        System.out.println("1. Food Court");
        System.out.println("2. Trends");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                customer1.chooseSection(new FoodCourt());
                break;
            case 2:
                customer1.chooseSection(new Trends());
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        customer1.shopping();
        scanner.close();
    }
}
