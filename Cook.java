public class Cook extends Employee{
    private double salary;
    private double taxRate;

    public Cook(int id, String name,double salary,double taxRate){
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

