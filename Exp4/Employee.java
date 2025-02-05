class Employee {
    private static int totalEmployees = 0;
    private String employeeID;
    private String name;
    private String department;
    private double salary;

    Employee() {
        this.employeeID = "Not Assigned";
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++;
    }

    Employee(String employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    double calculateSalary() {
        return salary;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("E101", "Alice", "IT", 60000);
        Employee emp2 = new Employee("E102", "Bob", "HR", 55000);
        Employee emp3 = new Employee();

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

        displayTotalEmployees();
    }
}