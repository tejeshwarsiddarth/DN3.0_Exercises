public class Main {
    public static void main(String[] args) {
        // Create an instance of EmployeeManagementSystem with a capacity of 5
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Create some Employee objects
        Employee emp1 = new Employee(101, "Alice Smith", "Developer", 60000);
        Employee emp2 = new Employee(102, "Bob Johnson", "Designer", 55000);
        Employee emp3 = new Employee(103, "Charlie Brown", "Manager", 75000);
        Employee emp4 = new Employee(104, "Diana Prince", "Analyst", 65000);
        Employee emp5 = new Employee(105, "Evan Stone", "Intern", 30000);

        // Add employees to the system
        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);
        ems.addEmployee(emp4);
        ems.addEmployee(emp5);

        // Traverse and print all employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for employee with ID 103:");
        Employee searchedEmployee = ems.searchEmployee(103);
        if (searchedEmployee != null) {
            System.out.println(searchedEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting employee with ID 102:");
        ems.deleteEmployee(102);

        // Traverse and print all employees after deletion
        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
