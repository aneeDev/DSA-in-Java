package intermediate;

import java.util.Scanner;

// Calculate nPr (Permutation): arrange ment of elements in a definite order
// Calculate nCr (Combination): selection of elements from a given set of elements.
public class PermutationCombination {

    public static void main(String[] args) {

        System.out.println("-------- \t PERMUTATION AND COMBINATION \t -------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of set of elements: ");
        int n = sc.nextInt();

        System.out.println("1. Permutation (nPr) \n 2. Combination (nCr): ");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        int r;

        switch(ch) {
            case 1:
                System.out.println("--------PERMUTATION (nPr) ---------");
                System.out.print("Enter the no.of elements to be arranged: ");
                r = sc.nextInt();
                if (n >= r) {
                    System.out.println("The value of " + n + "P" + r + " is " + permuation(n, r));
                } else {
                    System.out.println("The value of " + n + " should be >= " + r);
                }
                break;
            case 2:
                System.out.println("-------- COMBINATION (nCr) ---------");
                System.out.print("Enter the no.of elements to be selected: ");
                r = sc.nextInt();
                if (n >= r) {
                    System.out.println("The value of " + n + "C" + r + " is " + combination(n, r));
                } else {
                    System.out.println("The value of " + n + " should be >= " + r);
                }
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    private static double fact(double n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    private static double permuation(int n, int r) {
        double per = fact(n) / fact((n-r));
        return per;
    }

    private static double combination(int n, int r) {
        double com = (1/fact(r)) * permuation(n, r);
        return com;
    }
}
