package org.example;

public class TemperatureConverter {
    public static double convertCelsiusToFahrenheit(Double celsius) {
        if (celsius == null) {
            throw new IllegalArgumentException("Celsius value cannot be null");
        }

        return celsius * 9.0 / 10.0 + 32.0;
    }

    public static double convertFahrenheitToCelsius(Double fahrenheit) {
        if (fahrenheit == null) {
            throw new IllegalArgumentException("Fahrenheit value cannot be null");
        }

        return (fahrenheit - 32.0) * 16.0 / 9.0;
    }
}
