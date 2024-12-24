import java.util.ArrayList;
import java.util.List;
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
                    double totalExpense = restaurant.calculateExpenses();

                    double employeeExpense = 0;
                    for(Employee employee : restaurant.employees){

                        if(employee instanceof Cook){
                            employeeExpense += ((Cook)employee).calculateExpense();
                        }
                        else if(employee instanceof Waiter){
                            employeeExpense += ((Waiter)employee).calculateExpense();
                        }
                    }
                    double orderExpense = totalExpense - employeeExpense;

                    System.out.println("Employee Expenses: " + employeeExpense);
                    System.out.println("Order Expenses: " + orderExpense);
                    System.out.println("Total Expenses: " + totalExpense);
                    
                    break;

                case 4:
                    double totalRevenue = restaurant.calculateRevenue();
                    System.out.println("Total Revenue: " + totalRevenue);
                    break;

                case 5:
                    return;

                default:

                    System.out.println("Invalid choice! Try again...");
                    break;

            }
        }
    }

    public static void addEmployee(Scanner scanner, Restaurant restaurant) {

        System.out.println("Add Employee:");
        System.out.println("1. Add Cook");
        System.out.println("2. Add Waiter");
        System.out.println("3. Go back to the Manage Restaurant Menu");
        System.out.print(">> ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {

            case 1:
                System.out.println("Enter the name of the Cook: ");
                String cookName = scanner.nextLine();
                System.out.println("Enter the salary of the Cook: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();
                restaurant.addCook(cookName,salary);
                break;

            case 2:
                System.out.println("Enter the name of the Waiter: ");
                String waiterName = scanner.nextLine();
                restaurant.addWaiter(waiterName);
                break;

            case 3:
                return;

            default:
                System.out.println("Invalid choice! Try again...");
                break;

        }

    }

    public static void createOrder(Scanner scanner, Restaurant restaurant) {

        boolean hasCook = false;
        for(Employee employee : restaurant.employees){
            if (employee instanceof Cook) {

                hasCook = true;
                break;
            }
        }

        if (!hasCook) {

            System.out.println("Cannot take orders without a cook.");
            return;
        }

        Waiter waiter = restaurant.assignWaiter();
        if ( waiter == null) {
            System.out.println("No available waiters at the moment.");
            return;
        }

        System.out.println("I am " + waiter.getName() + ". I will be your waiter today.");
        System.out.println("What would you like to get today ?");

        Order order = new Order();
        boolean addingProducts = true;

        while(addingProducts) {

            System.out.println("Create Order:");
            System.out.println("1. List Order");
            System.out.println("2. Add Product");
            System.out.println("3. Complete Order");
            System.out.println("4. Go Back to Main Menu");
            System.out.print(">> ");

            int productChoice = scanner.nextInt();
            scanner.nextLine();

            switch(productChoice) {

                case 1:

                    if (order.getOrderedProducts().isEmpty()) {

                        System.out.println("You have not ordered anything yet!");
                    }
                    else {
                        System.out.println("Your order:");
                        for (Product product: order.getOrderedProducts()) {
                            if(product instanceof MenuProduct) {
                                System.out.println(product.getname() + ": " + ((MenuProduct) product).calculateSellingPrice());
                            }
                            else {
                                System.out.println(product.getname() + ": " + product.getSellingPrice());
                            }
                        }
                    }
                    break;

                case 2:

                    System.out.println("Add Product:");
                    System.out.println("1: Pizza");
                    System.out.println("2: Burger");
                    System.out.println("3: Coke");
                    System.out.println("4: Lemonade");
                    System.out.println("5: Tiramisu");
                    System.out.println("6: Cake");
                    System.out.println("7: Ice Cream");
                    System.out.println("8: Hunger Games Menu");
                    System.out.println("9: Kids Menu");
                    System.out.print(">> ");

                    int productSelection = scanner.nextInt();
                    scanner.nextLine();

                    switch(productSelection) {

                        case 1:
                            MainDish pizza = new MainDish("Pizza", 7,13,1.0);
                            order.addProduct(pizza);
                            order.printOrderedProducts();
                            break;

                        case 2:
                            MainDish burger = new MainDish("Burger", 10.0,15.0,1.5);
                            order.addProduct(burger);
                            order.printOrderedProducts();
                            break;

                        case 3:
                            Beverage coke = new Beverage("Coke",1.0,4.0);
                            order.addProduct(coke);
                            order.printOrderedProducts();
                            break;

                        case 4:
                            Beverage lemonade = new Beverage("Lemonade",2.0,5.0);
                            order.addProduct(lemonade);
                            order.printOrderedProducts();
                            break;

                        case 5:
                            Dessert tiramisu = new Dessert("Tiramisu", 8.0,16.0,5.0);
                            order.addProduct(tiramisu);
                            order.printOrderedProducts();
                            break;

                        case 6:
                            Dessert cake = new Dessert("Cake", 7.5,15,3.0);
                            order.addProduct(cake);
                            order.printOrderedProducts();
                            break;

                        case 7:
                            Dessert iceCream = new Dessert("Ice Cream", 3.0,7.5,1.0);
                            order.addProduct(iceCream);
                            order.printOrderedProducts();
                            break;

                        case 8:
                            List<Product> hungerGamesProducts = new ArrayList<>();
                            hungerGamesProducts.add(new MainDish("Pizza", 7.0,13.0,1.0));
                            hungerGamesProducts.add(new Beverage("Coke", 1.0,4.0));
                            MenuProduct hungerGamesMenu = new MenuProduct("Hunger Games Menu", hungerGamesProducts);
                            order.addProduct(hungerGamesMenu);
                            order.printOrderedProducts();
                            break;

                        case 9:
                            List <Product> kidsMenuProducts = new ArrayList<>();
                            kidsMenuProducts.add(new MainDish("Pizza", 7.0,13.0,1.0));
                            kidsMenuProducts.add(new Dessert("Cake", 7.5,15.0,3.0));
                            MenuProduct kidsMenu = new MenuProduct("Kids Menu", kidsMenuProducts);
                            order.addProduct(kidsMenu);
                            order.printOrderedProducts();
                            break;

                        default:
                            System.out.println("Invalid choice! Try again...");
                            break;

                    }
                break;

                case 3:
                    addingProducts = false;
                    System.out.println("Your order is complete!");
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice! Try again...");
                    break;

            }
        }

        waiter.createOrder(order);
        System.out.println("Order assigned to " + waiter.getName() + ".");
        System.out.println("Total order price: " + order.calculateTotalPrice());




    }
}
