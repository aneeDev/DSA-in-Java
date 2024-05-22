package basic;

import java.util.Scanner;

// Perimeter Of Circle
public class PerimeterOfCircle {
    public static void main(String[] args) {

        System.out.println("========= \t PERIMETER OF CIRCLE \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        final double pi = 3.14159;

        double p = 2*pi*r;
        System.out.println("Perimeter of Circle = " + p);
    }
}
