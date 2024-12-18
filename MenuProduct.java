import java.util.*;

public class MenuProduct extends Product {
    
    List<Product> productList;

    public MenuProduct(String name, List<Product> productList){

        super(name);
        
        this.productList = productList;
    }

    public double calculateExpense(){

        double totalExpense = 0;

        for( Product product : productList){
            
            if( product instanceof MainDish){

                totalExpense += 9/10 * ((MainDish) product).calculateExpense();
            }

            else if( product instanceof Dessert){

                totalExpense += 8/10 * ((Dessert) product).calculateExpense();
            }

            else if( product instanceof Beverage){

                totalExpense += 5/10 * ((Beverage) product).calculateExpense();
            }

            else{

                System.out.println(" The menu contains an unsupported product type");
            }
        }

        return totalExpense;
    }
}
