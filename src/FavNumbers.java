import java.util.Scanner; // Import Scanner from Java
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner to read user input
        int favInteger = SafeInput.getInt(in, "Enter your favorite integer"); // Use the SafeInput getInt() method to retrieve an integer without a range, with passing the parameters (scanner and prompt)
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double"); // Use the SafeInput getDouble() method to retrieve a double without a range, with passing the parameters (scanner and prompt)
    }
}