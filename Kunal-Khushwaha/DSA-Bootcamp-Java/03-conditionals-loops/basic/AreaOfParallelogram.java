package basic;

import java.util.Scanner;

// Area Of Parallelogram
public class AreaOfParallelogram {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF PARALLELOGRAM \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of parallelogram: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area = base * height;
        System.out.println("Area of Parallelogram = " + area + " square units");
    }
}
