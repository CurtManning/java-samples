// checks for dividing by 0.  - 5 0
// invalid arguments  -  5 a
// if you give it more than 2 args it doesn't run
// if you give it more or less than 2 args it does nothing.
// its integer math so if you give it 5 2 - it give 2 not 2.5 as an answer.

package com.samples;
 
public class NumberDivisionChecker {
    public static void main(String[] arguments) {
        if (arguments.length == 2) {
            int result = 0;
            try {
                result = Integer.parseInt(arguments[0]) /
                    Integer.parseInt(arguments[1]);
                System.out.println(arguments[0] + " divided by " +
                    arguments[1] + " equals " + result);
            } catch (NumberFormatException e) {
                System.out.println("Both arguments must be numbers.");
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by zero.");
            }
        }
    }
}