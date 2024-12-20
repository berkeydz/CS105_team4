import java.util.ArrayList;
public class Order{

  ArrayList<Product>Orderlist=new ArrayList<>();
  
  public void Addproduct(Product product){
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

    int totalprice=0;
    for(int i=0;i<Orderlist.size();i++){
      totalprice+=(Orderlist.get(i)).getSellingPrice();
      }

      return totalprice;
    } 
  }
      

    
