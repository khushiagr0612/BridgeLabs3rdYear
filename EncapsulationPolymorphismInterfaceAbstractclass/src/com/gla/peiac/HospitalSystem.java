package com.gla.peiac;

interface MedicalRecord {
	 void addRecord(String record);
	 void viewRecords();
	}

	//Abstract Patient class
	abstract class Patient implements MedicalRecord {
	 private int patientId;
	 private String name;
	 private int age;
	 private String diagnosis; // sensitive info

	 public Patient(int id, String name, int age, String diagnosis) {
	     this.patientId = id;
	     this.name = name;
	     this.age = age;
	     this.diagnosis = diagnosis;
	 }

	 public int getPatientId() { return patientId; }
	 public String getName() { return name; }
	 public int getAge() { return age; }

	 public void getPatientDetails() {
	     System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
	 }

	 public abstract double calculateBill();
	}

	//InPatient
	class InPatient extends Patient {
	 private int daysAdmitted;
	 private double dailyRate;

	 public InPatient(int id, String name, int age, String diagnosis, int days, double rate) {
	     super(id, name, age, diagnosis);
	     this.daysAdmitted = days;
	     this.dailyRate = rate;
	 }

	 @Override
	 public double calculateBill() {
	     return daysAdmitted * dailyRate;
	 }

	 @Override
	 public void addRecord(String record) {
	     System.out.println("InPatient record added: " + record);
	 }

	 @Override
	 public void viewRecords() {
	     System.out.println("InPatient medical records accessed (confidential).");
	 }
	}

	//OutPatient
	class OutPatient extends Patient {
	 private double consultationFee;

	 public OutPatient(int id, String name, int age, String diagnosis, double fee) {
	     super(id, name, age, diagnosis);
	     this.consultationFee = fee;
	 }

	 @Override
	 public double calculateBill() {
	     return consultationFee;
	 }

	 @Override
	 public void addRecord(String record) {
	     System.out.println("OutPatient record added: " + record);
	 }

	 @Override
	 public void viewRecords() {
	     System.out.println("OutPatient medical records accessed (confidential).");
	 }
	}

	//Main
	public class HospitalSystem {
	 public static void main(String[] args) {
	     Patient p1 = new InPatient(101, "Ravi Kumar", 40, "Surgery", 5, 2000);
	     Patient p2 = new OutPatient(102, "Neha Sharma", 28, "Fever", 500);

	     Patient[] patients = {p1, p2};

	     for (Patient p : patients) {
	         p.getPatientDetails();
	         System.out.println("Bill: " + p.calculateBill());
	         p.addRecord("Sample record");
	         p.viewRecords();
	         System.out.println("--------------------------------");
	     }
	 }
	}
