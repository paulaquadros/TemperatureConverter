package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @org.junit.jupiter.api.Test
    void testFailureToConvertCelsiusToFahrenheitDueToNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            TemperatureConverter.convertCelsiusToFahrenheit(null);
        });
    }

    @org.junit.jupiter.api.Test
    void testFailureToConvertFahrenheitToCelsiusDueToNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            TemperatureConverter.convertFahrenheitToCelsius(null);
        });
    }

    @org.junit.jupiter.api.Test
    void testConvertCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.convertCelsiusToFahrenheit(0.0), 0.0);
        assertEquals(100.94, TemperatureConverter.convertCelsiusToFahrenheit(38.3), 0.0);
        assertEquals(68.0, TemperatureConverter.convertCelsiusToFahrenheit(20.0), 0.0);
    }

    @org.junit.jupiter.api.Test
    void testConvertFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.convertFahrenheitToCelsius(32.0), 0.0);
        assertEquals(15.0, TemperatureConverter.convertFahrenheitToCelsius(59.0), 0.0);
        assertEquals(-5.0, TemperatureConverter.convertFahrenheitToCelsius(23.0), 0.0);
    }

}