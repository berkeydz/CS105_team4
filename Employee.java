public class Employee  {
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
    }
 
        
    
    
}
 
