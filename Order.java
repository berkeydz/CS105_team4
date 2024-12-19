import java.util.ArrayList;
Public class Order(){
  Arraylist<Product>Orderlist=new Arraylist<>()
  public void Addproduct(product){
    Orderlist.add(product);
  }
  public void listOrder(){
    for (int i=0;i<Orderlist.size();i++){
      System.out.println(Orderlist.get(i);
    }
  }
  public void getlist(list){
    return list.get(i);
  }
  public void getOrderedProducts(){
    return Orderlist;
  }
  public double calculatetotalPrice(){
    int a=0;
    for(int i=0;i<Orderlist.size();i++){
      a+=(Orderlist.get(i)).getSellingPrice;
    }
      
      

    
