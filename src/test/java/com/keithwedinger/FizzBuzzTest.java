package com.keithwedinger;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void useIfThenElseWithDefaultRangeEnd() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<String> actualResults = fizzBuzz.useIfThenElse();
        assertEquals(FizzBuzz.DEFAULT_RANGE_END, actualResults.size());
    }

    @Test
    void useIfThenElseWithSpecifiedRange() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        ArrayList<String> actualResults = fizzBuzz.useIfThenElse();
        assertEquals(15, actualResults.size());

        ArrayList<String> expectedResults = new ArrayList<>(
            Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
            )
        );
        assertEquals(expectedResults, actualResults);
    }

    @Test
    void useMapWithDefaultRangeEnd() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> actualResults = fizzBuzz.useMap();
        assertEquals(FizzBuzz.DEFAULT_RANGE_END, actualResults.size());
    }

    @Test
    void useMapWithSpecifiedRange() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        List<String> actualResults = fizzBuzz.useMap();
        assertEquals(15, actualResults.size());

        ArrayList<String> expectedResults = new ArrayList<>(
            Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
            )
        );
        assertEquals(expectedResults, actualResults);
    }
}
