package basic;

import java.util.Scanner;

// Volume Of Cone
public class VolumeOfCone {
    public static void main(String[] args) {

        System.out.println("========= \t VOLUME OF CONE  \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double h = sc.nextDouble();

        final double pi = 3.14159;

        double volume = 0.33 * pi * Math.pow(r, 2) * h;
        System.out.println("Volume of Cone = " + volume + " cubic units");
    }
}
