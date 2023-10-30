import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private LocalDate birthDate;
    private double salary;

    public Employee(int id, String name, LocalDate birthDate, double salary) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", salary=" + salary + "]";
    }
}


public class EmployeeeManagementSystem {

    private List<Employee> employees = new ArrayList<>();
    private int nextEmployeeId = 1;

    public void addEmployee(String name, LocalDate birthDate, double salary) {
        Employee employee = new Employee(nextEmployeeId, name, birthDate, salary);
        employees.add(employee);
        nextEmployeeId++;
    }
    

    // public void updateEmployee(int id, String name, LocalDate birthDate, double salary) {
    //     Optional<Employee> employeeOptional = employees.stream()
    //             .filter(e -> e.getId() == id)
    //             .findFirst();
    //     if (employeeOptional.isPresent()) {
    //         Employee employee = employeeOptional.get();
    //         employee.name = name;
    //         employee.birthDate = birthDate;
    //         employee.salary = salary;
    //     } else {
    //         System.out.println("Employee not found.");
    //     }
    // }

    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    public List<Employee> sortEmployees(Comparator<Employee> comparator) {
        return employees.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public long countEmployees() {
        return employees.size();
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        EmployeeeManagementSystem ems = new EmployeeeManagementSystem();

        ems.addEmployee("John Doe", LocalDate.of(1990, 5, 15), 60000.0);
        ems.addEmployee("Jane Smith", LocalDate.of(1985, 8, 10), 70000.0);
        ems.addEmployee("Bob Johnson", LocalDate.of(1995, 3, 25), 55000.0);

        System.out.println("List of all emp--------");
        // Listing all employees
        List<Employee> allEmployees = ems.getAllEmployees();
        allEmployees.forEach(System.out::println);

        //System.out.println("Update emp----------");
        // Update an employee
        // ems.updateEmployee(1, "John Updated", LocalDate.of(1992, 1, 1), 65000.0);

        System.out.println("deleted an emp-----------");
        // Delete an employee
        ems.deleteEmployee(2);

        System.out.println("sorted emp------------");
        // Sorting employees by salary (ascending)
        List<Employee> sortedEmployees = ems.sortEmployees(Comparator.comparing(Employee::getSalary));
        sortedEmployees.forEach(System.out::println);

        System.out.println("----------");
        // Count of employees
        long employeeCount = ems.countEmployees();
        System.out.println("Total employees: " + employeeCount);
    }


}
