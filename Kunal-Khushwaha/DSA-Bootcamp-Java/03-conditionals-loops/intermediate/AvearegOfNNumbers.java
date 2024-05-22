package intermediate;

import java.util.Scanner;

// Average of N Numbers
public class AvearegOfNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 to stop): ");
        int n;
        int s = 0, c = 0;
        do {
           n = sc.nextInt();
           c++;
           s += n;
        } while (n != 0);

        double avg = s / c;
        System.out.println("Average of numbers: " + avg);
    }
}
