// WAP ro print the circumference and area of a circle of radius entered by user by defining your own method

import java.util.Scanner;

public class AreaPeriOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.printf("Area = %.2f %n Circumference = %.2f", area(radius), circum(radius));
    }

    static double area(double r) {

        double area = Math.PI * (r*r);
        return area;
    }

    static double circum(double r) {
        double circumference = 2 * Math.PI * r;
        return circumference;
    }
}
