import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter unit price of the item: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity + " and unit price is INR " + unitPrice
        );
    }
	}
