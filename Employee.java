public class Employee  {
    private static int id = 0;
    private String name;

    public Employee(int id,String name){
        this.id= id;
        this.name = name ;
        // to give every employee different ids, increment the id in this line ( this.id++;)
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
 
