import java.util.ArrayList;
import java.util.Random;

public class Restaurant {

    protected ArrayList<Employee> employees;
    private ArrayList<Product> products;

    public Restaurant() {
        employees = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void listEmployees() {

        if (employees.isEmpty()) {

            System.out.println("There are no employees.");
            return;

        }

        System.out.println("Employees:");
        for (Employee employee : employees) {

            System.out.println("Employee ID: " + employee.getId() + " Name: " + employee.getName());

            if (employee instanceof Cook) {

                Cook cook = (Cook) employee;
                System.out.println("Role: Cook, Salary: " + cook.getSalary());

            }

            if(employee instanceof Waiter) {

                System.out.println("Role: Waiter");

            }

        }

    }

    public void addCook(String name, double salary) {

        Cook newCook = new Cook(name,salary);
        employees.add(newCook);
        System.out.println("Added cook: " + name);

    }

    public void addWaiter(String name) {

        Waiter newWaiter = new Waiter(name);
        employees.add(newWaiter);
        System.out.println("Added waiter: " + name);

    }

    public Waiter assignWaiter() {

        ArrayList<Waiter> waiters = new ArrayList<>();

        for (Employee employee:employees){
            if(employee instanceof Waiter) {
                waiters.add((Waiter) employee);

            }

        }

        if (waiters.isEmpty()) {
            System.out.println("There are no waiters.");
            return null;
        }

        Random rand = new Random();
        int randomIndex =rand.nextInt(waiters.size());
        Waiter assignedWaiter = waiters.get(randomIndex);

        System.out.println("Assigned waiter: " + assignedWaiter.getName());

        return assignedWaiter;


    }

    public double calculateExpenses() {

        double totalExpenses = 0.0;

        for(Employee employee : employees) {

            if(employee instanceof Cook) {

                Cook cook = (Cook) employee;
                totalExpenses += cook.getSalary() + (cook.getSalary()*cook.getTaxRate());

            }

            if (employee instanceof Waiter) {

                Waiter waiter = (Waiter) employee;
                totalExpenses += waiter.calculateExpense();

                ArrayList<Order> ordersReceived = waiter.getOrdersReceived();

                for (Order order : ordersReceived) {

                    ArrayList<Product> orderedProducts = order.getOrderedProducts();
                    
                    for(Product product : orderedProducts){

                        if(product instanceof MenuProduct){

                            totalExpenses += product.calculateExpense();
                        }
                        else{
                        totalExpenses += product.getPurchasePrice() + product.getUtilityCost();
                        }
                    }

                }
            }
        }
        return totalExpenses;
    }


    public double calculateRevenue() {

        double totalRevenue = 0.0;

        for (Employee employee : employees){
            if(employee instanceof Waiter) {

                Waiter waiter = (Waiter) employee;

                ArrayList<Order> ordersReceived = waiter.getOrdersReceived();
                for (Order order : ordersReceived) {

                    totalRevenue += order.calculateTotalPrice();

                }

            }

        }
        return totalRevenue;
    }

    
    public ArrayList<Product> getProducts() {

        return products;

    }


}





