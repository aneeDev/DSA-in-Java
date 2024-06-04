// Write a function that returns the first N natural numbers

import java.util.Scanner;

public class sumOfN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + sumN(n));
    }

    static int sumN(int n) {

        int sum = 0;

        sum = (n * (n+1))/2;

        return sum;
    }
}
