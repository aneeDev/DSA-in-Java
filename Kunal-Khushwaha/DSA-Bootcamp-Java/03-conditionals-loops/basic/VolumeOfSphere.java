package basic;

import java.util.Scanner;

// Volume Of Sphere
public class VolumeOfSphere {
    public static void main(String[] args) {

        System.out.println("========= \t VOLUME OF SPHERE  \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere: ");
        double r = sc.nextDouble();

        final double pi = 3.14159;

        double volume = 1.33 * pi * Math.pow(r, 3);
        System.out.println("Volume of Sphere = " + volume + " cubic units");
    }
}
