import java.util.Scanner; // Import Scanner from Java
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // Create a scanner to read user input
        String firstName = ""; // Initialize a variable for the first name (user input)
        String lastName = ""; // Initialize a variable for the last name (user input)
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // Use the SafeInput getNonZeroLenString() method with passing the parameters (scanner and prompt) for first name
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // Use the SafeInput getNonZeroLenString() method with passing the parameters (scanner and prompt) for last name
        System.out.println("\nYour full name is: " + firstName + " " + lastName); // Outputs the user's full name
    }
}