import java.util.Scanner; // Import Scanner from Java
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner to read user input
        double itemPrice; // Create variable for the item price (user input)
        double totalCost = 0; // Initialize variable for the total cost, initially 0. We add the item prices to the total cost in the do-while loop
        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00); // Use SafeInput gerRangedDouble() method to retrieve a ranged double price from 0.50 to 10.00, inclusive
            totalCost += itemPrice; // We add the item price to our total price
        }
        while (SafeInput.getYNConfirm(in, "Would you like to continue entering items? [Y/N]")); // Continue looping and asking for item prices while user says yes (which returns true and so it satisfies the condition)
        System.out.printf("The total cost of your items is: %.2f", totalCost); // Output total cost of the items entered to 2 decimal places with printf
    }
}