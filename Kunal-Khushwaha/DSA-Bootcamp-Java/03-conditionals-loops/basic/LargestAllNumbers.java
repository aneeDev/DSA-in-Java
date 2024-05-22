package basic;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest numbers from;
public class LargestAllNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter a number (enter 0 to stop): ");

        do {
            n = sc.nextInt();

            if (n > max)
                max = n;

        } while (n != 0);

        System.out.println("Largest of all numbers: " + max);
    }
}
