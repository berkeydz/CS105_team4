public abstract class Employee implements Expense  {
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
    }

    public double calculateExpense(){

        return 0;
    }

    
 
        
    
    
}
 
