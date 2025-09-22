package com.gla.peiac;

//Interface Taxable
interface Taxable {
double calculateTax();
String getTaxDetails();
}

//Abstract Product Class
abstract class Product {
private int productId;
private String name;
private double price;

// Constructor
public Product(int productId, String name, double price) {
   this.productId = productId;
   this.name = name;
   this.price = price;
}

// Encapsulation (Getters & Setters)
public int getProductId() {
   return productId;
}

public void setProductId(int productId) {
   this.productId = productId;
}

public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}

public double getPrice() {
   return price;
}

public void setPrice(double price) {
   this.price = price;
}

// Abstract method
public abstract double calculateDiscount();

// Concrete method to display product details
public void displayDetails() {
   System.out.println("Product ID: " + productId);
   System.out.println("Name: " + name);
   System.out.println("Price: " + price);
}
}

//Electronics class
class Electronics extends Product implements Taxable {
private int warrantyYears;

public Electronics(int productId, String name, double price, int warrantyYears) {
   super(productId, name, price);
   this.warrantyYears = warrantyYears;
}

@Override
public double calculateDiscount() {
   // Example: 10% discount on electronics
   return getPrice() * 0.10;
}

@Override
public double calculateTax() {
   // Example: 18% GST
   return getPrice() * 0.18;
}

@Override
public String getTaxDetails() {
   return "18% GST applied on Electronics";
}

@Override
public void displayDetails() {
   super.displayDetails();
   System.out.println("Warranty: " + warrantyYears + " years");
   System.out.println(getTaxDetails());
}
}

//Clothing class
class Clothing extends Product implements Taxable {
private String size;

public Clothing(int productId, String name, double price, String size) {
   super(productId, name, price);
   this.size = size;
}

@Override
public double calculateDiscount() {
   // Example: 20% discount on clothing
   return getPrice() * 0.20;
}

@Override
public double calculateTax() {
   // Example: 5% GST
   return getPrice() * 0.05;
}

@Override
public String getTaxDetails() {
   return "5% GST applied on Clothing";
}

@Override
public void displayDetails() {
   super.displayDetails();
   System.out.println("Size: " + size);
   System.out.println(getTaxDetails());
}
}

//Groceries class
class Groceries extends Product {
private double weight;

public Groceries(int productId, String name, double price, double weight) {
   super(productId, name, price);
   this.weight = weight;
}

@Override
public double calculateDiscount() {
   // Example: 5% discount on groceries
   return getPrice() * 0.05;
}

@Override
public void displayDetails() {
   super.displayDetails();
   System.out.println("Weight: " + weight + " kg");
   System.out.println("No tax applicable on groceries.");
}
}

//Main Class
public class ECommercePlatform {
// Polymorphic method to calculate final price
public static void printFinalPrice(Product product) {
   double price = product.getPrice();
   double discount = product.calculateDiscount();
   double tax = 0;

   // If product is taxable, calculate tax
   if (product instanceof Taxable) {
       tax = ((Taxable) product).calculateTax();
   }

   double finalPrice = price + tax - discount;

   // Display details
   product.displayDetails();
   System.out.println("Discount: " + discount);
   System.out.println("Tax: " + tax);
   System.out.println("Final Price: " + finalPrice);
   System.out.println("--------------------------------");
}

public static void main(String[] args) {
   // Create products
   Product p1 = new Electronics(101, "Laptop", 60000, 2);
   Product p2 = new Clothing(102, "T-Shirt", 2000, "M");
   Product p3 = new Groceries(103, "Rice", 1500, 10);

   // Polymorphism in action
   Product[] products = {p1, p2, p3};

   System.out.println("=== E-Commerce Platform ===");
   for (Product p : products) {
       printFinalPrice(p);
   }
}
}