public class Employee  {
    // make this class abstract so it cannot be constructed directly an employee must be either a cook or a waiter.
    private static int id = 0;
    private String name;

    public Employee(int id,String name){
        this.id= id;
        this.name = name ;
        
    }
    public static int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "." ;
        // return the name and the id of the employee here.
    }
 
        
    
    
}
 
