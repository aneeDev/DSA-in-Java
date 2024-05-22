package basic;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers;
public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int s = 0;

        System.out.println("Enter a number (enter 0 to stop): ");

        do {
            n = sc.nextInt();
            s += n;
        } while (n != 0);

        System.out.println("Sum of all numbers: " + s);
    }
}
