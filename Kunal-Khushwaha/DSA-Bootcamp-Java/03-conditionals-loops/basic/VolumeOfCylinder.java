package basic;

import java.util.Scanner;

// Volume Of Cylinder
public class VolumeOfCylinder {
    public static void main(String[] args) {

        System.out.println("========= \t VOLUME OF Cylinder  \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of cylinder: ");
        double h = sc.nextDouble();

        final double pi = 3.14159;

        double volume = pi * Math.pow(r, 2) * h;
        System.out.println("Volume of Cylinder = " + volume + " cubic units");
    }
}
