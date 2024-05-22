package basic;

import java.util.Scanner;

// Curved Surface area of Cylinder
public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {

        System.out.println("========= \t CURVED SURFACE AREA OF CYLINDER \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder base: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder base: ");
        double h = sc.nextDouble();

        final double pi = 3.14159;

        double csa = 2 * pi * r * h;
        System.out.println("Curved Surface Area of cylinder = " + csa);
    }
}
