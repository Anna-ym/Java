public class Employee {
    int empId;
    String name;
    double salary;

   
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

   
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    
    public static void main(String[] args) {
        
        Employee emp = new Employee(101, "Alice", 50000);
        System.out.println("Employee Details:");
        emp.display();

        
        Manager mgr = new Manager(102, "Bob", 75000, "Sales");
        System.out.println("\nManager Details:");
        mgr.display();
    }
}


class Manager extends Employee {
    String department;

    
    Manager(int empId, String name, double salary, String department) {
        super(empId, name, salary);
        this.department = department;
    }

    
    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
