import java.util.ArrayList;

public class Waiter extends Employee{
    private double orderRate = 0.1;
    // Initialize orderRate as %10.
    private ArrayList<Order> ordersReceived;

    public Waiter(String name ){
        super(name);
        this.ordersReceived = new ArrayList<>();
    }

    public void createOrder(Order order){
        ordersReceived.add(order);
    }
    public ArrayList<Order> getOrdersReceived(){
        return ordersReceived;
    }

    
    public double calculateExpense(){
        double totalEarn = 0.0;
        for (Order order: ordersReceived){
            totalEarn += order.calculateTotalPrice() * this.orderRate;
            // instead of multiplying with 0.1 multiply with orderRate.
        }
        return totalEarn;
    }

    
}
