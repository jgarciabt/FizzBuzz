package jgarciabt.fizzbuzz;

/**
 * Created by Jose Garcia on 01/03/2016.
 */
public class FizzBuzzHelper {

    public String getFizzBuzz(int number) {

        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
