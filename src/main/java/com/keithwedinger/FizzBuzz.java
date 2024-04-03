package com.keithwedinger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static final int DEFAULT_RANGE_END = 100;

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = String.format("%s%s", FIZZ, BUZZ);

    private final int rangeEnd;
    private ArrayList<String> fizzBuzzResults;

    public FizzBuzz() {
        rangeEnd = DEFAULT_RANGE_END;
        initializeResults(rangeEnd);
    }

    public FizzBuzz(int rangeEnd) {
        this.rangeEnd = rangeEnd;
        initializeResults(rangeEnd);
    }

    public ArrayList<String> useIfThenElse() {
        IntStream.rangeClosed(1, this.rangeEnd).forEach(number -> {
            if (number % 15 == 0) {
                fizzBuzzResults.add(FIZZBUZZ);
            } else if (number % 3 == 0) {
                fizzBuzzResults.add(FIZZ);
            } else if (number % 5 == 0) {
                fizzBuzzResults.add(BUZZ);
            } else {
                fizzBuzzResults.add(String.valueOf(number));
            }
        });

        return fizzBuzzResults;
    }

    public List<String> useMap() {
        return IntStream.rangeClosed(1, this.rangeEnd).mapToObj(number -> {
            if (number % 15 == 0) {
                return FIZZBUZZ;
            } else if (number % 3 == 0) {
                return (FIZZ);
            } else if (number % 5 == 0) {
                return (BUZZ);
            } else {
                return String.valueOf(number);
            }
        }).toList();
    }

    private void initializeResults(int rangeEnd) {
        this.fizzBuzzResults = new ArrayList<>(rangeEnd);
    }
}
