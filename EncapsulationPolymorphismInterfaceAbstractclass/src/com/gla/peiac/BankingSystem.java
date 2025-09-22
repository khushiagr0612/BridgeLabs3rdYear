package com.gla.peiac;

//Loanable interface
interface Loanable {
void applyForLoan(double amount);
boolean calculateLoanEligibility();
}

//Abstract BankAccount class
abstract class BankAccount implements Loanable {
private String accountNumber;
private String holderName;
private double balance;

public BankAccount(String accountNumber, String holderName, double balance) {
   this.accountNumber = accountNumber;
   this.holderName = holderName;
   this.balance = balance;
}

// Encapsulation
public String getAccountNumber() {
   return accountNumber;
}
public String getHolderName() {
   return holderName;
}
public double getBalance() {
   return balance;
}
protected void setBalance(double balance) {
   this.balance = balance;
}

// Concrete methods
public void deposit(double amount) {
   balance += amount;
   System.out.println(holderName + " deposited " + amount);
}
public void withdraw(double amount) {
   if (amount <= balance) {
       balance -= amount;
       System.out.println(holderName + " withdrew " + amount);
   } else {
       System.out.println("Insufficient balance!");
   }
}

// Abstract method
public abstract double calculateInterest();
}

//SavingsAccount class
class SavingsAccount extends BankAccount {
public SavingsAccount(String accNo, String name, double balance) {
   super(accNo, name, balance);
}

@Override
public double calculateInterest() {
   return getBalance() * 0.04; // 4% interest
}

@Override
public void applyForLoan(double amount) {
   System.out.println("Savings Account Loan applied for: " + amount);
}

@Override
public boolean calculateLoanEligibility() {
   return getBalance() >= 5000;
}
}

//CurrentAccount class
class CurrentAccount extends BankAccount {
public CurrentAccount(String accNo, String name, double balance) {
   super(accNo, name, balance);
}

@Override
public double calculateInterest() {
   return getBalance() * 0.02; // 2% interest
}

@Override
public void applyForLoan(double amount) {
   System.out.println("Current Account Loan applied for: " + amount);
}

@Override
public boolean calculateLoanEligibility() {
   return getBalance() >= 20000;
}
}

//Main
public class BankingSystem {
public static void main(String[] args) {
   BankAccount acc1 = new SavingsAccount("SAV101", "Amit Sharma", 10000);
   BankAccount acc2 = new CurrentAccount("CUR202", "Priya Verma", 30000);

   BankAccount[] accounts = {acc1, acc2};

   for (BankAccount acc : accounts) {
       System.out.println("Account Holder: " + acc.getHolderName());
       System.out.println("Balance: " + acc.getBalance());
       System.out.println("Interest: " + acc.calculateInterest());
       acc.applyForLoan(50000);
       System.out.println("Loan Eligible: " + acc.calculateLoanEligibility());
       System.out.println("--------------------------------");
   }
}
}
