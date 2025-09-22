package com.gla.peiac;

//Discountable interface
interface Discountable {
double applyDiscount(double amount);
String getDiscountDetails();
}

//Abstract FoodItem class
abstract class FoodItem implements Discountable {
private String itemName;
private double price;
private int quantity;

public FoodItem(String itemName, double price, int quantity) {
   this.itemName = itemName;
   this.price = price;
   this.quantity = quantity;
}

public String getItemName() { return itemName; }
public double getPrice() { return price; }
public int getQuantity() { return quantity; }

public void getItemDetails() {
   System.out.println(itemName + " | Price: " + price + " | Qty: " + quantity);
}

public abstract double calculateTotalPrice();
}

//VegItem
class VegItem extends FoodItem {
public VegItem(String itemName, double price, int quantity) {
   super(itemName, price, quantity);
}

@Override
public double calculateTotalPrice() {
   return getPrice() * getQuantity();
}

@Override
public double applyDiscount(double amount) {
   return amount * 0.90; // 10% off
}

@Override
public String getDiscountDetails() {
   return "10% discount applied on Veg items.";
}
}

//NonVegItem
class NonVegItem extends FoodItem {
public NonVegItem(String itemName, double price, int quantity) {
   super(itemName, price, quantity);
}

@Override
public double calculateTotalPrice() {
   return getPrice() * getQuantity() + 50; // Extra charge
}

@Override
public double applyDiscount(double amount) {
   return amount * 0.95; // 5% off
}

@Override
public String getDiscountDetails() {
   return "5% discount applied on Non-Veg items.";
}
}

//Main
public class FoodDeliverySystem {
public static void main(String[] args) {
   FoodItem f1 = new VegItem("Paneer Tikka", 250, 2);
   FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);

   FoodItem[] items = {f1, f2};

   for (FoodItem item : items) {
       item.getItemDetails();
       double total = item.calculateTotalPrice();
       double discounted = item.applyDiscount(total);
       System.out.println("Total Price: " + total);
       System.out.println(item.getDiscountDetails());
       System.out.println("Final Price after Discount: " + discounted);
       System.out.println("--------------------------------");
   }
}
}