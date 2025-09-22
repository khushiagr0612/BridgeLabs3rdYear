package com.gla.vehiclerentalsystem;

//Interface Insurable
interface Insurable {
double calculateInsurance();
String getInsuranceDetails();
}

//Abstract class Vehicle
abstract class Vehicle implements Insurable {
private String vehicleNumber;
private String type;
private double rentalRate;
private String insurancePolicyNumber; // Sensitive info (encapsulation)

// Constructor
public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
   this.vehicleNumber = vehicleNumber;
   this.type = type;
   this.rentalRate = rentalRate;
   this.insurancePolicyNumber = insurancePolicyNumber;
}

// Encapsulation: getters/setters
public String getVehicleNumber() {
   return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
   this.vehicleNumber = vehicleNumber;
}

public String getType() {
   return type;
}

public void setType(String type) {
   this.type = type;
}

public double getRentalRate() {
   return rentalRate;
}

public void setRentalRate(double rentalRate) {
   this.rentalRate = rentalRate;
}

// Restricted access: no public getter for insurancePolicyNumber
protected String getInsurancePolicyNumber() {
   return insurancePolicyNumber; // accessible only to subclasses
}

// Abstract method
public abstract double calculateRentalCost(int days);

// Concrete method
public void displayDetails(int days) {
   System.out.println("Vehicle Number: " + vehicleNumber);
   System.out.println("Type: " + type);
   System.out.println("Rental Rate per day: " + rentalRate);
   System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
   System.out.println("Insurance Cost: " + calculateInsurance());
   System.out.println(getInsuranceDetails());
   System.out.println("--------------------------------");
}
}

//Car class
class Car extends Vehicle {
public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
   super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
}

@Override
public double calculateRentalCost(int days) {
   // Cars: flat rate × days
   return getRentalRate() * days;
}

@Override
public double calculateInsurance() {
   // Example: 5% of rental cost
   return getRentalRate() * 0.05;
}

@Override
public String getInsuranceDetails() {
   return "Car Insurance: 5% of rental rate applied. Policy No. (confidential).";
}
}

//Bike class
class Bike extends Vehicle {
public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
   super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
}

@Override
public double calculateRentalCost(int days) {
   // Bikes: discount if more than 7 days
   double cost = getRentalRate() * days;
   if (days > 7) {
       cost *= 0.9; // 10% discount
   }
   return cost;
}

@Override
public double calculateInsurance() {
   // Example: 2% of rental rate
   return getRentalRate() * 0.02;
}

@Override
public String getInsuranceDetails() {
   return "Bike Insurance: 2% of rental rate applied. Policy No. (confidential).";
}
}

//Truck class
class Truck extends Vehicle {
public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
   super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
}

@Override
public double calculateRentalCost(int days) {
   // Trucks: extra surcharge if more than 5 days
   double cost = getRentalRate() * days;
   if (days > 5) {
       cost += 2000; // fixed surcharge
   }
   return cost;
}

@Override
public double calculateInsurance() {
   // Example: 10% of rental rate
   return getRentalRate() * 0.10;
}

@Override
public String getInsuranceDetails() {
   return "Truck Insurance: 10% of rental rate applied. Policy No. (confidential).";
}
}

//Main class
public class VehicleRentalSystem {
public static void main(String[] args) {
   // Polymorphism in action
   Vehicle v1 = new Car("CAR123", 2000, "CAR-INS-001");
   Vehicle v2 = new Bike("BIKE456", 500, "BIKE-INS-002");
   Vehicle v3 = new Truck("TRUCK789", 5000, "TRUCK-INS-003");

   Vehicle[] vehicles = {v1, v2, v3};

   int days = 10; // sample rental duration

   System.out.println("=== Vehicle Rental System ===");
   for (Vehicle v : vehicles) {
       v.displayDetails(days);
   }
}
}