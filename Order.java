import java.util.ArrayList;
public class Order{

  ArrayList<Product>Orderlist=new ArrayList<>();
  
  public void addProduct(Product product){
    Orderlist.add(product);
  }
  public void listOrder(){
    for (int i=0;i<Orderlist.size();i++){
      System.out.println(Orderlist.get(i));
    }
  }

  

  public ArrayList<Product> getOrderedProducts(){
    return Orderlist;
  }
  
  public double calculateTotalPrice(){

    double totalprice=0;
    for(Product product : Orderlist){
      if(product instanceof MainDish){
        totalprice += ((MainDish)product).getSellingPrice();
      }
      else if(product instanceof Dessert){
        totalprice += ((Dessert)product).getSellingPrice();
      }
      else if(product instanceof Beverage){
        totalprice += ((Beverage)product).getSellingPrice();
      }
      else if(product instanceof MenuProduct){
        totalprice += ((MenuProduct)product).calculateSellingPrice();
      }
    }

      return totalprice;
    } 

    public void printOrderedProducts(){
      for(Product product : Orderlist){
        if(product instanceof MenuProduct){
          System.out.println(product.getname() + ": " + ((MenuProduct)product).calculateSellingPrice());
        }
        else{
        System.out.println(product.getname() + ": " + product.getSellingPrice());
        }
      }
    }
  }
      

    
