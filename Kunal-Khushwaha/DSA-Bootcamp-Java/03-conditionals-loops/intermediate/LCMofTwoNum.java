package intermediate;

import java.util.Scanner;

// LCM of two Numbers
public class LCMofTwoNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------- \t LCM OF TWO NUMBERS \t ----------");
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (n1 * n2) / gcd;
        System.out.println("LCM of two numbers: " + lcm);
    }


}
