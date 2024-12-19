import java.util.ArrayList;
Public class Order(){
  //there should not be () after the class name
  //public should start with lower-case

  Arraylist<Product>Orderlist=new Arraylist<>()
  // there should be a "}" here.
  
  // the type of the parameter should be given here as "Product product"
  public void Addproduct(product){
    Orderlist.add(product);
  }
  public void listOrder(){
    for (int i=0;i<Orderlist.size();i++){
      System.out.println(Orderlist.get(i);
    }
  }

  // Can not understand the purpose of this function.
  public void getlist(list){
    return list.get(i);
  }

  // as this functions returns an ArrayList its return type should be ArrayList instead of void.
  public void getOrderedProducts(){
    return Orderlist;
  }
  
  public double calculatetotalPrice(){
    // calculateTotalPrice "t" of "total" should be capitalized.

    // We can name "a" as "totalPrice" for more readable code.
    int a=0;
    for(int i=0;i<Orderlist.size();i++){
      a+=(Orderlist.get(i)).getSellingPrice;
    }
      
      

    
