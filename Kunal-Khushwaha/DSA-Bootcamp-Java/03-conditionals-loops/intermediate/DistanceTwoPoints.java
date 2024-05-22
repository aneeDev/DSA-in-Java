package intermediate;

import java.util.Scanner;

// Calculate Distance between two points
public class DistanceTwoPoints {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the points co-ordinates: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double xdist = Math.pow((x2-x1), 2);
        double ydist = Math.pow((y2-y1), 2);

        double dist = Math.sqrt(xdist + ydist);
        System.out.println("Distance between ("+x1+","+y1+") and ("+x2+","+y2+") is: " + dist);
    }
}
