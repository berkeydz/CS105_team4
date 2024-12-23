public class Cook extends Employee{
    private double salary;
    private double taxRate = 0.18;
    //initialize tax rate here as 18.

    public Cook(String name,double salary){
        // The class diagram says that this function has parameters(int,String,double) so it should not take tax rate as a parameter it should have
        //three parameters and the tax rate should be initialized at the beginning.
        super(name);
        this.salary =salary;
    }
    public double getSalary(){
        return salary;
    }
    public double getTaxRate(){
        return taxRate;
    }
    public double calculateExpense(){
        return salary + (salary * taxRate);
    }
}

