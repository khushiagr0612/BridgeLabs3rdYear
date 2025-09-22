package com.gla.peiac;

//Interface
interface GPS {
String getCurrentLocation();
void updateLocation(String location);
}

//Abstract class
abstract class RideVehicle {
private String vehicleId;
private String driverName;
private double ratePerKm;

public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
   this.vehicleId = vehicleId;
   this.driverName = driverName;
   this.ratePerKm = ratePerKm;
}

public String getVehicleId() {
   return vehicleId;
}

public String getDriverName() {
   return driverName;
}

public double getRatePerKm() {
   return ratePerKm;
}

public abstract double calculateFare(double distance);

public void getVehicleDetails() {
   System.out.println("Vehicle ID: " + vehicleId);
   System.out.println("Driver: " + driverName);
   System.out.println("Rate per Km: " + ratePerKm);
}
}

//Subclass Car
class Car extends RideVehicle implements GPS {
private String currentLocation;

public Car(String vehicleId, String driverName, double ratePerKm) {
   super(vehicleId, driverName, ratePerKm);
}

@Override
public double calculateFare(double distance) {
   return distance * getRatePerKm();
}

@Override
public String getCurrentLocation() {
   return currentLocation;
}

@Override
public void updateLocation(String location) {
   this.currentLocation = location;
}
}

//Subclass Bike
class Bike extends RideVehicle implements GPS {
private String currentLocation;

public Bike(String vehicleId, String driverName, double ratePerKm) {
   super(vehicleId, driverName, ratePerKm);
}

@Override
public double calculateFare(double distance) {
   // Discounted fare for bikes
   return distance * getRatePerKm() * 0.8;
}

@Override
public String getCurrentLocation() {
   return currentLocation;
}

@Override
public void updateLocation(String location) {
   this.currentLocation = location;
}
}

//Subclass Auto
class Auto extends RideVehicle implements GPS {
private String currentLocation;

public Auto(String vehicleId, String driverName, double ratePerKm) {
   super(vehicleId, driverName, ratePerKm);
}

@Override
public double calculateFare(double distance) {
   // Slightly cheaper than cars
   return distance * getRatePerKm() * 0.9;
}

@Override
public String getCurrentLocation() {
   return currentLocation;
}

@Override
public void updateLocation(String location) {
   this.currentLocation = location;
}
}

//Main class to demonstrate polymorphism
public class RideHailingApp {
public static void main(String[] args) {
   RideVehicle car = new Car("C101", "Rahul Sharma", 15.0);
   RideVehicle bike = new Bike("B202", "Amit Singh", 10.0);
   RideVehicle auto = new Auto("A303", "Sunil Kumar", 12.0);

   RideVehicle[] rides = {car, bike, auto};

   double distance = 10; // 10 km ride
   for (RideVehicle v : rides) {
       v.getVehicleDetails();
       System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
       System.out.println("---------------------------------");
   }
}
}
