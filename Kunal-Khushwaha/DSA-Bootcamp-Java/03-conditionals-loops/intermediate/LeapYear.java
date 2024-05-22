package intermediate;

import java.util.Scanner;

// To check Leap Year or not
public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
            } else {
                isLeap = false;
            }
        }
        System.out.println(year + (isLeap ?" is a leap year." : " is not a leap year"));
    }
}
