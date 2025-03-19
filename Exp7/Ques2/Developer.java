package Exp7.Ques2;

class Developer extends Employee{
    double hourlySalary;int workHour;
    Developer(String name,String role,double hourlySalary,int workHour)
    {
        super(name,role);
        this.hourlySalary=hourlySalary;
        this.workHour=workHour;
    }
    @Override
    public void calculateSalary()
    {
        salary=hourlySalary*workHour*4.0;
    }
    @Override
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
        System.out.println("Salary : "+salary);
    }
}
