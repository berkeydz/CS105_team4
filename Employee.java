public abstract class Employee implements Expense  {
    private static int counter = 0;
    private int id;
    private String name;

    public Employee(String name){

        this.name = name ;
        this.id = ++counter;
        
        
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "name: " + this.name + "id: " + this.id;
    }

    public double calculateExpense(){

       return 0;
    }

}
 
