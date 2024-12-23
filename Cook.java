public class Cook extends Employee{
    private double salary;
    private double taxRate = 0.18;

    public Cook(String name,double salary){
        super(name);
        this.salary =salary;
    }
    public double getSalary(){
        return salary;
    }
    public double getTaxRate(){
        return taxRate;
    }

    @Override
    public double calculateExpense(){
        return salary + (salary * taxRate);
    }
}

