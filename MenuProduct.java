import java.util.*;

public class MenuProduct extends Product {
    
    List<Product> productList;

    public MenuProduct(String name, List<Product> productList){

        super(name);
        
        this.productList = productList;
    }

    public double calculateSellingPrice(){

        double totalPrice = 0;

        for( Product product : productList){
            
            if( product instanceof MainDish){

                totalPrice += 9/10 * product.getSellingPrice();
            }

            else if( product instanceof Dessert){

                totalPrice += 8/10 * product.getSellingPrice();
            }

            else if( product instanceof Beverage){

                totalPrice += 5/10 * product.getSellingPrice();
            }

            else{

                System.out.println(" The menu contains an unsupported product type to calculate its selling price");
            }
        }

        return totalPrice;
    }

    public double calculateExpense(){

        double totalExpense = 0;

        for(Product product : productList){

            if( product instanceof MainDish){

                totalExpense += ((MainDish)product).calculateExpense();
            }

            else if( product instanceof Dessert){

                totalExpense += ((Dessert)product).calculateExpense();
            }

            else if( product instanceof Beverage){

                totalExpense += ((Beverage)product).calculateExpense();
            }

            else{

                System.out.println(" The menu contains an unsupported product type to calculate its expense");
            }
        }

        return totalExpense;
    }
}
