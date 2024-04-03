package com.keithwedinger;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz;
        if (args.length == 1) {
            fizzBuzz = new FizzBuzz(Integer.parseInt(args[0]));
        } else {
            fizzBuzz = new FizzBuzz();
        }
        fizzBuzz.useIfThenElse().forEach(System.out::println);
    }
}
