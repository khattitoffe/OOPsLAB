package Exp9;

public class Employee{
    private String name;
    private String ID;
    private float salary;
    
    Employee(String name,String ID, float salary)
    {
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }
    
    public String getName()
    {
        return name;
    }
    public String getID()
    {
        return ID;
    }
    public float getSalary()
    {
        return salary;
    }
    
    public void setName(String myName)
    {   
      name=myName;  
    }
    public void setID(String myID)
    {   
      ID=myID; 
    }
    public void setSalary(float mySalary)
    {   
      if(mySalary<=0)
      {
          System.out.println("Salary Cannot be Less than or Equal to Zero");
          return;
      }
      salary=mySalary;
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + ID + ", salary=" + salary + "}";
    }
}