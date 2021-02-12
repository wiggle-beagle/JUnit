import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
   public void testPlus_validArgument_success() {
        //given
        int a = 5;
        int b = 10;
        int expected = 15;
        //when
        int result = calculator.plus(a,b);
        //then
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testMinus_validArgument_success() {
        //given
        int a = 15;
        int b = 10;
        int expected = 5;
        //when
        int result = calculator.minus(a,b);
        //then
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testMultiplication_validArgument_success() {
        //given
        int a = 7;
        int b = 10;
        int expected = 70;
        //when
        int result = calculator.multiplication(a,b);
        //then
        Assertions.assertEquals(expected, result);


    }



    @Test
    public void testDivision_validArgument_success() {
        //given
        int a = 150;
        int b = 10;
        int expected = 15;
        //when
        int result = calculator.division(a,b);
        //then
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testDivision_validArgument_nonSuccess() {
        //given
        int a = 150;
        int b = 0;

        //except
        Assertions.assertThrows(RuntimeException.class, ()->
                calculator.division(a,b));

    }


    @Test
    public void testExponentiation_validArgument_success() {
        //given
        int a = 5;
        int b = 5;
        int expected = 3125;
        //when
        int result = calculator.exponentiation(a,b);
        //then
        Assertions.assertEquals(expected, result);


    }
}