package com.gla.inheri;

// Superclass
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Manages Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    private String duration;

    public Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}

// Test Class
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 101, 80000, 10),
            new Developer("Bob", 102, 60000, "Java"),
            new Intern("Charlie", 103, 20000, "6 months")
        };

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("-----------------");
        }
    }
}