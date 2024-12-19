public class Cook extends Employee{
    private double salary;
    private double taxRate;
    //initialize tax rate here as 18.

    public Cook(int id, String name,double salary,double taxRate){
        // The class diagram says that this function has parameters(int,String,double) so it should not take tax rate as a parameter it should have
        //three parameters and the tax rate should be initialized at the beginning.
        super(id,name);
        this.salary =salary;
        this.taxRate = taxRate;
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

