package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
    }
}