import java.util.Scanner; // Import Scanner from Java
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner to read user input
        String SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$"); // Input SSN that matches the regEx pattern
        String UCMnum = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{5}$"); // Input UC M number that matches the regEx pattern
        String menuItem = SafeInput.getRegExString(in, "Would you like to open, save, view, or quit?", "^[OoSsVvQq]$"); // Input menu item that matches the regEx pattern
    }
}