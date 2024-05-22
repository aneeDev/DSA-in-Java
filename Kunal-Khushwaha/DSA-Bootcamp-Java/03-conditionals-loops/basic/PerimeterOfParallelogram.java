package basic;

import java.util.Scanner;

// Perimeter Of Parallelogram
public class PerimeterOfParallelogram {
    public static void main(String[] args) {

        System.out.println("========= \t PERIMETER OF PARALLELOGRAM \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of adjacent sides of parallelogram: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double p = 2 * (a + b);
        System.out.println("Perimeter of Parallelogram = " +p);
    }
}
