package com.gla.peiac;

//Reservable interface
interface Reservable {
void reserveItem();
boolean checkAvailability();
}

//Abstract class LibraryItem
abstract class LibraryItem implements Reservable {
private int itemId;
private String title;
private String author;
private boolean available = true;

public LibraryItem(int itemId, String title, String author) {
   this.itemId = itemId;
   this.title = title;
   this.author = author;
}

public int getItemId() { return itemId; }
public String getTitle() { return title; }
public String getAuthor() { return author; }

public void getItemDetails() {
   System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
}

public abstract int getLoanDuration();

@Override
public void reserveItem() {
   if (available) {
       available = false;
       System.out.println(title + " reserved successfully.");
   } else {
       System.out.println(title + " is not available.");
   }
}

@Override
public boolean checkAvailability() {
   return available;
}
}

//Subclasses
class Book extends LibraryItem {
public Book(int id, String title, String author) {
   super(id, title, author);
}
@Override
public int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem {
public Magazine(int id, String title, String author) {
   super(id, title, author);
}
@Override
public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
public DVD(int id, String title, String author) {
   super(id, title, author);
}
@Override
public int getLoanDuration() { return 3; }
}

//Main
public class LibrarySystem {
public static void main(String[] args) {
   LibraryItem i1 = new Book(1, "Java Programming", "James Gosling");
   LibraryItem i2 = new Magazine(2, "Tech Today", "Editorial Team");
   LibraryItem i3 = new DVD(3, "Inception", "Christopher Nolan");

   LibraryItem[] items = {i1, i2, i3};

   for (LibraryItem item : items) {
       item.getItemDetails();
       System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
       item.reserveItem();
       System.out.println("Available: " + item.checkAvailability());
       System.out.println("--------------------------------");
   }
}
}