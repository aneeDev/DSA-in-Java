package basic;

import java.util.Scanner;

// Area Of Rectangle
public class AreaOfRectangle {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF Rectangle \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("Area of Reactangle = " + area + " square units");
    }
}
