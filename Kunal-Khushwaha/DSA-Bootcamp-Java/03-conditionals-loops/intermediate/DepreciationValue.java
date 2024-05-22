package intermediate;

import java.util.Scanner;

// Calculate the Depreciation of Value
public class DepreciationValue {

    public static void main(String[] args) {

        long amount, depreciation, year, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount: ");
        amount = sc.nextLong();

        System.out.println("Enter depreciation %: ");
        depreciation = sc.nextLong();

        System.out.println("Enter no.of years: ");
        year = sc.nextLong();

        temp = amount;
        for (int i = 0; i < year; i++) {
            temp = ((100 - depreciation) * temp) / 100;
        }

        System.out.println("After depreciation = " + temp);
    }
}
