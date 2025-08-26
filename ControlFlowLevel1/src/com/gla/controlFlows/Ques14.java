package  com.gla.controlFlows;

import java.util.*;
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if number is negative
        if (num < 0) {
            System.out.println("Sorry, factorial does not exist for negative numbers.");
        } else if (num == 0) {
            System.out.println("The factorial of 0 is 1");
        } else {
            int factorial = 1;
            int i = 1;


            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }

        sc.close();
    }
}
