import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = in.nextDouble();

        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = in.nextDouble();

        double windChillFahrenheit = 35.74
                + 0.6215 * temperature
                - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        double windChillCelsius = (windChillFahrenheit - 32) * (5.0 / 9.0);

        System.out.println("The windchill in Fahrenheit is " + windChillFahrenheit);
        System.out.println("The windchill in Celsius is " + windChillCelsius);
    }
}