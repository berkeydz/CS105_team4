public class Product implements Expense{

    private String name;
    private double purchasePrice;
    private double sellingPrice;
    private double utilityCost;

    public String getname(){
        return this.name;
    }

    public double getPurchasePrice(){
        return this.purchasePrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public double getUtilityCost(){
        return this.utilityCost;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPurchasePrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public void setUtilityCost(double utilityCost){
        this.utilityCost = utilityCost;
    }

    public Product(String name, double purchasePrice, double sellingPrice, double utilityCost){

        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.utilityCost = utilityCost;
    }

    public Product(String name){
        
        this.name = name;
    }

    @Override
    public String toString(){
        
        return "name: " + this.name + " Purchase Price: " + this.purchasePrice + " Selling Price: " + this.sellingPrice 
        + " Utility Cost " + this.utilityCost;
    }

    public double calculateExpense(){

        return -999;
    }
}