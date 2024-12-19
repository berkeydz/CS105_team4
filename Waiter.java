import java.util.ArrayList;

public class Waiter extends Employee{
    private double orderRate;
    private ArrayList<Order> ordersReceived;

    public Waiter(int id,String name ){
        super(id,name);
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
            totalEarn += order.calculateTotalPrice() * 0.1;
        }
        return totalEarn;
    }

    
}
