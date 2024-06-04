// Define two methods to print maximum and minimum no. resp among three numbers entered by user.

import java.util.Scanner;

public class MaxMinOf3Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("Maximum and minimum of %d, %d and %d is: %n ", a, b, c);
        System.out.printf("Maximum = %d%n", maximum(a, b, c));
        System.out.printf("Minimum = %d", minimum(a, b, c));


    }

    private static int maximum(int x, int y, int z) {

        int max = x;
        if (y > max)
            max = y;
        if (z > max)
            max = z;

        return max;
    }

    private static int minimum(int x, int y, int z) {

        int min = x;
        if (y < min)
            min = y;
        if (z < min)
            min = z;

        return min;
    }
}
