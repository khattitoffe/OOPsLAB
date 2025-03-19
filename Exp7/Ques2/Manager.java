package Exp7.Ques2;

class Manager extends Employee{
    double fixedSalary;
    Manager(String name,String role,double fixedSalary)
    {
        super(name,role);
        this.fixedSalary=fixedSalary;
    }
    @Override
    public void calculateSalary()
    {
        salary=fixedSalary;
    }
    @Override
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
        System.out.println("Salary : "+salary);
    }
}
