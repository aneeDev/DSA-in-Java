import java.util.Scanner;

/**
 * WAP that will ask user to enter his/her marks (out of 100). Define a method that will display grades according to the marks enteres as below
 * Marks - Grades
 * 91-100 - AA
 * 81-90 - AB
 * 71-80 - BB
 * 61-70 - BC
 * 51-60 - CD
 * 41-50 - DD
 * <=40 - Fail
 */

public class MarksGrades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks (out of 100): ");
        double marks = sc.nextDouble();

        System.out.print("Grade = " + grades(marks));
    }

    private static String grades(double marks) {

        String grade = "";
        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        } else if (marks >= 81 && marks <= 90) {
            grade = "AB";
        } else if (marks >= 71 && marks <= 80) {
            grade = "BB";
        } else if (marks >= 61 && marks <= 70) {
            grade = "BC";
        } else if (marks >= 51 && marks <= 60) {
            grade = "CD";
        } else if (marks >= 41 && marks <= 50) {
            grade = "DD";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}
