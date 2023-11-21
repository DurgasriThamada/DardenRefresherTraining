package collections.java;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	// Comparable interface to allow sorting of employees
    @Override
    public int compareTo(Employee other) {
        // Assuming you want to sort based on employee names
        return this.name.compareTo(other.name);
    }
}

public class TreeSet_3 {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>();

        employeeSet.add(new Employee(1, "John Doe", "IT", 50000.0));
        employeeSet.add(new Employee(2, "Jane Smith", "HR", 60000.0));

        System.out.println("Select choice to sort:");
        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("c) Department");
        System.out.println("d) Salary");

        Scanner sc= new Scanner(System.in);
        String choice = sc.next();

        switch (choice) {
            case "a":
                // Sort by ID
                employeeSet.stream()
                			.sorted((e1,e2)->Integer.compare(e1.getId(), e2.getId()))
                			.forEach(System.out::println);
                break;
            case "b":
                // Sort by Name
            	employeeSet.stream()
                        .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                        .forEach(System.out::println);
                break;
            case "c":
                // Sort by Department
            	employeeSet.stream()
                        .sorted((e1, e2) -> e1.getDepartment().compareTo(e2.getDepartment()))
                        .forEach(System.out::println);
                break;
            case "d":
                // Sort by Salary
            	employeeSet.stream()
                        .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                        .forEach(System.out::println);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

}
