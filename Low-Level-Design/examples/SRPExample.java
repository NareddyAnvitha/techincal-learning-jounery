
class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class SalaryCalculator {
    void calculateSalary() {
        System.out.println("Calculating employee salary");
    }
}

class EmployeeRepository {
    void saveEmployee(Employee employee) {
        System.out.println(
            "Saving employee: " + employee.getName()
        );
    }
}

public class SRPExample {
    public static void main(String[] args) {

        Employee employee = new Employee("Anu");

        SalaryCalculator calculator = new SalaryCalculator();
        EmployeeRepository repository = new EmployeeRepository();

        calculator.calculateSalary();
        repository.saveEmployee(employee);
    }
}
