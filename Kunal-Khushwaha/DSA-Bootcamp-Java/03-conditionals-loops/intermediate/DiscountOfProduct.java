package intermediate;

import java.util.Scanner;

// Calculate Discount of Product
public class DiscountOfProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product market price: ");
        double mp = sc.nextDouble();
        System.out.print("Enter the discount for the product: ");
        double discount = sc.nextDouble();

        double discountPrice = mp * (discount/100);
        double discountedPrice = mp - discountPrice;
        System.out.println("Price after " + discount + "% of the product is Rs" + discountedPrice);
    }
}
