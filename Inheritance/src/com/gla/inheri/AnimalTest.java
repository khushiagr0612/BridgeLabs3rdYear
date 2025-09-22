package com.gla.inheri;

//Superclass
class Animal {
 private String name;
 private int age;

 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void makeSound() {
     System.out.println("Animal makes a sound.");
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}

//Subclass Dog
class Dog extends Animal {
 public Dog(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Woof Woof!");
 }
}

//Subclass Cat
class Cat extends Animal {
 public Cat(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Meow Meow!");
 }
}

//Subclass Bird
class Bird extends Animal {
 public Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Tweet Tweet!");
 }
}

//Test Class
public class AnimalTest {
 public static void main(String[] args) {
     Animal[] animals = {
         new Dog("Bruno", 3),
         new Cat("Kitty", 2),
         new Bird("Mithu", 1)
     };

     for (Animal a : animals) {
         a.makeSound();
     }
 }
}