// WAP to print the sum of two numbers entered by user by defining your own method

import java.util.Scanner;

public class SumOf2Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double sum = add(a, b);
        System.out.printf("Sum of %.2f and %.2f = %.2f", a, b, sum);
    }

    static double add(double x, double y) {
        return x+y;
    }
}
