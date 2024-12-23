public abstract class Employee implements Expense  {
    // make this class abstract so it cannot be constructed directly an employee must be either a cook or a waiter.
    private static int id = 0;
    private String name;

    public Employee(String name){

        this.name = name ;
        Employee.id++;
        
        
    }
    public static int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "name: " + this.name + "id: " + Employee.id;
        // return the name and the id of the employee here.
    }

    public double calculateExpense(){

        return 0;
    }

    
 
        
    
    
}
 
