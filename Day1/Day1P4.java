package Day1;

public class Day1P4 {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in celcius: ");
        double celcius = Double.parseDouble(args[0]);
        System.out.println("Temperature in farenheit: " + celciusToFarenheit(celcius));
    }

    private static double celciusToFarenheit(double celcius) {
        return (celcius * (9 / 5)) + 32;
    }
}
