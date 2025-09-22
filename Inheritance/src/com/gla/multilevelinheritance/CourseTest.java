package com.gla.multilevelinheritance;

class Course {
    private String courseName;
    private int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass OnlineCourse
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse (multilevel)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // %

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + getFinalFee());
    }
}

// Test Class
public class CourseTest {
    public static void main(String[] args) {
        Course basic = new Course("C Programming", 6);
        OnlineCourse online = new OnlineCourse("Java Basics", 8, "Udemy", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Advanced Java", 12, "Coursera", true, 500, 20);

        basic.displayCourseInfo();
        System.out.println("-----------------");
        online.displayCourseInfo();
        System.out.println("-----------------");
        paid.displayCourseInfo();
    }
}