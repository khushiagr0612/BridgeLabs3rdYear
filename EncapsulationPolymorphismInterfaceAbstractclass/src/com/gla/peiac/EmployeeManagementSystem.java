package com.gla.peiac;

//Interface Department
interface Department {
void assignDepartment(String deptName);
String getDepartmentDetails();
}

//Abstract Class Employee
abstract class Employee implements Department {
private int employeeId;
private String name;
private double baseSalary;
private String department;

// Constructor
public Employee(int employeeId, String name, double baseSalary) {
   this.employeeId = employeeId;
   this.name = name;
   this.baseSalary = baseSalary;
}

// Encapsulation: getters and setters
public int getEmployeeId() {
   return employeeId;
}

public void setEmployeeId(int employeeId) {
   this.employeeId = employeeId;
}

public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}

public double getBaseSalary() {
   return baseSalary;
}

public void setBaseSalary(double baseSalary) {
   this.baseSalary = baseSalary;
}

// Abstract method
public abstract double calculateSalary();

// Concrete method
public void displayDetails() {
   System.out.println("Employee ID: " + employeeId);
   System.out.println("Name: " + name);
   System.out.println("Base Salary: " + baseSalary);
   System.out.println("Department: " + department);
   System.out.println("Calculated Salary: " + calculateSalary());
   System.out.println("------------------------------");
}

// Implement interface methods
@Override
public void assignDepartment(String deptName) {
   this.department = deptName;
}

@Override
public String getDepartmentDetails() {
   return department;
}
}

//FullTimeEmployee class
class FullTimeEmployee extends Employee {
public FullTimeEmployee(int employeeId, String name, double baseSalary) {
   super(employeeId, name, baseSalary);
}

@Override
public double calculateSalary() {
   // Full-time employee salary = baseSalary + fixed bonus
   return getBaseSalary() + 5000;
}
}

//PartTimeEmployee class
class PartTimeEmployee extends Employee {
private int hoursWorked;
private double hourlyRate;

public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
   super(employeeId, name, baseSalary);
   this.hoursWorked = hoursWorked;
   this.hourlyRate = hourlyRate;
}

public int getHoursWorked() {
   return hoursWorked;
}

public void setHoursWorked(int hoursWorked) {
   this.hoursWorked = hoursWorked;
}

public double getHourlyRate() {
   return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
   this.hourlyRate = hourlyRate;
}

@Override
public double calculateSalary() {
   // Part-time salary = baseSalary + (hoursWorked × hourlyRate)
   return getBaseSalary() + (hoursWorked * hourlyRate);
}
}

//Main Class
public class EmployeeManagementSystem {
public static void main(String[] args) {
   // Polymorphism: Employee reference can hold different objects
   Employee e1 = new FullTimeEmployee(101, "Amit Sharma", 40000);
   e1.assignDepartment("IT");

   Employee e2 = new PartTimeEmployee(102, "Priya Verma", 10000, 80, 200);
   e2.assignDepartment("HR");

   Employee e3 = new FullTimeEmployee(103, "Rahul Mehta", 45000);
   e3.assignDepartment("Finance");

   // Processing list of employees polymorphically
   Employee[] employees = {e1, e2, e3};

   System.out.println("=== Employee Details ===");
   for (Employee emp : employees) {
       emp.displayDetails();
   }
}
}