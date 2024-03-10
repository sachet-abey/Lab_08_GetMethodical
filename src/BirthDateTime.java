import java.util.Scanner; // Import Scanner from Java
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner to read user input
        int year = SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2015); // Use SafeInput getRangedInt() method to retrieve a ranged integer year from 1950 to 2015, inclusive
        int month = SafeInput.getRangedInt(in, "Enter your month of birth", 1, 12); // Use SafeInput getRangedInt() method to retrieve a ranged integer month from 1 to 12, inclusive
        int maxDay = 0; // Initialize a variable for the maximum day based on the month (or the number of days for the month). We don't need a minDay variable because we know that's 1
        switch (month) { // Use a switch statement to find the number of days of the month given
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: // If the month number is 1, 3, 5, 7, 8, 10, or 12
                maxDay = 31; // Then the maximum day possible is 31
                break; // Break to terminate switch statement
            case 4: case 6: case 9: case 11: // If the month number is 4, 6, 9, or 11
                maxDay = 30; // Then the maximum day possible is 30
                break; // Break to terminate switch statement
            case 2: // If the month number is 2 (February)
                maxDay = 29; // Then the maximum day possible is 29
                break; // Break to terminate switch statement
        }
        int day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, maxDay); // Use SafeInput getRangedInt() method to retrieve a ranged integer day from 1 to the maximum day of the month, inclusive
        int hour = SafeInput.getRangedInt(in, "Enter your hour of birth", 1, 24); // Use SafeInput getRangedInt() method to retrieve a ranged integer hour from 1 to 24, inclusive
        int minute = SafeInput.getRangedInt(in, "Enter your minute of birth", 1, 59); // Use SafeInput getRangedInt() method to retrieve a ranged integer minute from 1 to 59, inclusive
    }
}