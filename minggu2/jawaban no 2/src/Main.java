import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Department
        Department deptIT = new Department("IT");
        Department deptHR = new Department("HR");

        // Membuat objek EmploymentType
        EmploymentType fullTime = new EmploymentType("Full-Time");
        EmploymentType partTime = new EmploymentType("Part-Time");

        // Membuat objek EmployeeService
        EmployeeService service = new EmployeeService();

        // Membuat objek Employee dan menambahkannya ke service
        Employee emp1 = new Employee("Alice", deptIT, fullTime, 120000);
        service.addEmployee(emp1);

        Employee emp2 = new Employee("Bob", deptHR, partTime, 30000);
        service.addEmployee(emp2);

        // Menguji nextId
        Employee.nextId(); // Increment ID statis jika diperlukan

        // Menampilkan informasi employee
        System.out.println("Employee 1: " + emp1.getName() + ", Dept: " + emp1.getDepartment().getName() + ", Type: " + emp1.getType().getType() + ", Salary: " + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getName() + ", Dept: " + emp2.getDepartment().getName() + ", Type: " + emp2.getType().getType() + ", Salary: " + emp2.getSalary());

        // Menguji raise salary melalui service
        service.raiseSalary(emp1.getId(), 10); // Naikkan gaji 10%
        System.out.println("After raise, Employee 1 Salary: " + service.getEmployee(emp1.getId()).getSalary());

        // Menguji getter dan setter
        emp2.setName("Bobby");
        System.out.println("Updated Employee 2 Name: " + emp2.getName());
    }
}
 
