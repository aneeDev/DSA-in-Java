package intermediate;

/**
 * Kunal is allowed to go out with his friends only on even days of a given month.
 * WAP to count number of days he can go out in month of August
 */
public class EvenDaysToGoOut {

    public static void main(String[] args) {

        int c = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                c++;
            }
        }
        System.out.println("Kunal can go out with his friends " + c + " days in the month of August.");
    }
}
