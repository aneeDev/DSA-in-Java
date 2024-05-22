package basic;

import java.util.Scanner;

// Addition of two numbers
public class AddOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition of two numbers are: " + (a+b));
    }
}
