package intermediate;

import java.util.Scanner;

/**
 * WAP to print the sum of negative, positive even, positive odd numbers from a list of N numbers.
 * This list terminates when user enters a 0
 */
public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (enter 0 to stop): ");

        int sn = 0, se = 0, so = 0;
        while(true) {

            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                if (n < 0) {
                    sn += n;
                } else if (n > 0) {
                    if (n % 2 == 0) {
                        se += n;
                    } else {
                        so += n;
                    }
                }
            }
        }
        System.out.println("Sum of Negative numbers: " + sn);
        System.out.println("Sum of Positive Even numbers: " + se);
        System.out.println("Sum of Positive odd numbers: " + so);
    }
}
