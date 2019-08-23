package se.ecjava.mattias;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test för metoder med coverage.
 */
public class AppTest {
    //Additions test
    @Test
    public void test_addition_return_result() {
        double firstNumber = 5.0;
        double secondNumber = 2.0;
        double expectedResult = 7.0;

        double result = Arithmetic.addition(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result, 0);
    }
    //Subtractions test
    @Test
    public void test_subtraction_return_result() {
        double firstNumber = 10.0;
        double secondNumber = 5.0;
        double expectedResult = 5.0;

        double result = Arithmetic.subtraction(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result, 0);
    }

    //Multiplications test
    @Test
    public void test_multiplication_return_result() {
        double firstNumber = 5.0;
        double secondNumber = 2.0;
        double expectedResult = 10.0;

        double result = Arithmetic.multiplication(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result, 0);
    }
    //Divisions test
    @Test
    public void test_division_return_result() {
        double firstNumber = 10.0;
        double secondNumber = 2.0;
        double expectedResult = 5.0;

        double result = Arithmetic.division(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result, 0);
    }
}
