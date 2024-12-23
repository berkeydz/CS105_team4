import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        System.out.println("Welcome to OZU Restaurant.");

        while(true) {

            System.out.println("Main Menu:");
            System.out.println("1. Create Order");
            System.out.println("2. Manage Restaurant");
            System.out.println("3. Exit Program");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:
                    createOrder(scanner, restaurant);
                    break;

                case 2:
                    manageRestaurant(scanner, restaurant);
                    break;

                case 3:
                    System.out.println("Bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again...");
                    break;

            }


        }
    }

    public static void manageRestaurant(Scanner scanner, Restaurant restaurant) {

        while(true) {

            System.out.println("Manage Restaurant:");
            System.out.println("1. List Employees");
            System.out.println("2. Add Employee");
            System.out.println("3. Calculate Expenses");
            System.out.println("4. Calculate Revenue");
            System.out.println("5. Go Back to Main Menu");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:
                    restaurant.listEmployees();
                    break;

                case 2:
                    addEmployee(scanner,restaurant);
                    break;

                case 3:

                    // Will be completed later.
                    break;

                case 4:
                    double totalRevenue = restaurant.calculateRevenue();
                    System.out.println("Total Revenue: " + totalRevenue);

                case 5:
                    return;

                default:

                    System.out.println("Invalid choice! Try again...");
                    break;

            }
        }
    }
}
