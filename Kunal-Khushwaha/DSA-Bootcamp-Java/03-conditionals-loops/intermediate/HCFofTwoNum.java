package intermediate;

import java.util.Scanner;

// HCF of two Numbers
public class HCFofTwoNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------- \t HCF OF TWO NUMBERS \t ----------");
        System.out.print("Enter first number: ");
        long n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        long n2 = sc.nextInt();

        long result = hcfCal(n1, n2);
        System.out.println("HCF of two numbers: " + result);
    }

    static long hcfCal(long a, long b) {
        long temp;
        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
