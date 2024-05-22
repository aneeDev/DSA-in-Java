package basic;

import java.util.Scanner;

// Area Of Circle
public class AreaOfCircle {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF CIRCLE  \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        final double pi = 3.14159;

        double area = pi * Math.pow(r, 2);
        System.out.println("Area of Circle = " + area);
    }
}
