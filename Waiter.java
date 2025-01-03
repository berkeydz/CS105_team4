import java.util.ArrayList;

public class Waiter extends Employee{
    
    private double orderRate = 0.1;
    
    private ArrayList<Order> ordersReceived;

    public double getOrderRate() {
        return orderRate;
    }

    public void setOrderRate(double orderRate) {
        this.orderRate = orderRate;
    }

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


    @Override
    public double calculateExpense(){
        double totalEarn = 0.0;
        for (Order order: ordersReceived){
            totalEarn += order.calculateTotalPrice() * this.orderRate;
            
        }
        return totalEarn;
    }

    
}
