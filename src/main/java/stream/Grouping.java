package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Firoz Mahmud", "Development", "Software Engineer"),
                new Employee("John", "Development", "DevOps Engineer"),
                new Employee("Alice", "Business", "Business Analyst")
        );

        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::department));

        byDept.forEach((dept, emps) -> {
            System.out.println("Department: " + dept);
            emps.forEach(emp -> System.out.println(emp.name + " - " + emp.designation));
            System.out.println("====================");
        });

    }

    record Employee(String name, String department, String designation) {

    }

}
