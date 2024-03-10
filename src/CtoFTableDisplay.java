public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Cel Fah"); // Label the columns, the left one being celsius and the right one being fahrenheit
        for(int i = -100; i <= 100; i++) { // Celsius 1 degree increments from -100 to 100, inclusive
            System.out.println(i+" "+CtoF(i)); // Print celsius (i) and then the converted fahrenheit (by using the CtoF() method)
        }
    }
    public static double CtoF(double celsius) {
        return 1.8 * celsius + 32; // Convert celsius to fahrenheit by multiplying it by 1.8 and then adding 32
    }
}