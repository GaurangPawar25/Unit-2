public class Temperature {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 77.0;

        System.out.println(celsius + "°C is equal to " + celsiusToFahrenheit(celsius) + "°F" + "\n" + fahrenheit + "°F is equal to " + fahrenheitToCelsius(fahrenheit) + "°C");
        System.out.println();
    }
}
