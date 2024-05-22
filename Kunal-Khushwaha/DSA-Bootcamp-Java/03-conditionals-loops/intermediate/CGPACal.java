package intermediate;

import java.util.Scanner;

// Calculate CGPA
public class CGPACal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int n = sc.nextInt();

        double s = 0.0;

        System.out.println("Enter the grades of " + n + " subjects out of 10.");
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the grade of Subject " + i + ": ");
            double marks = sc.nextDouble();

            s += marks;
        }
        System.out.println("CGPA = " + (s/n));
    }
}
