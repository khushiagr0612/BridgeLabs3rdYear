package com.gla.hybridinheritance;

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1: Chef
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking " + specialty + " dishes.");
    }
}

// Subclass 2: Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables.");
    }
}

// Main class
public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Arjun", 101, "Italian");
        Worker waiter = new Waiter("Ravi", 202, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}