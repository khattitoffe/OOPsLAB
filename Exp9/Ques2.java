package Exp9;
import java.util.*;

class Ques2{
    public static void main(String[] args)
    {
        ArrayList<Employee> myList=new ArrayList<>();
        
        Employee myemp1=new Employee("Sarthak","ID2F321",150000);
        Employee myemp2=new Employee("Keshav","ID2A290",123000);
        Employee myemp3=new Employee("Ram","ID2AR11",23000);
        
        myList.add(myemp1);
        myList.add(myemp2);
        myList.add(myemp3);
        
        for (Employee emp : myList) {
            if (emp.getID() == "ID2AR11") {
                emp.setSalary(58000);
                break;
            }
        }
        Iterator<Employee> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getID() == "ID2A290") {
                iterator.remove();
                break;
            }
        }

        
        printEmployees(myList);
    }
    
     public static void printEmployees(ArrayList<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("The employee list is empty.");
            return;
        }
        for (Employee emp : list) {
            System.out.println(emp); // Relies on the Employee.toString() method
        }
    }
    
    
}