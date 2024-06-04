// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProdOf2Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double p = prod(a, b);
        System.out.printf("Sum of %.2f and %.2f = %.2f", a, b, p);
    }

    static double prod(double x, double y) {
        return x*y;
    }
}
