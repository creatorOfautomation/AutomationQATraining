package tests;

import com.exception.DivisionOnZeroException;
import com.exception.WrongFormatExpressionException;
import methods.Calculator;
import org.junit.Test;

public class NegativeTest {

   // @Test(expected = WrongFormatExpressionException.class)
    public void negativeTest() throws WrongFormatExpressionException, DivisionOnZeroException {
        Calculator.evaluate("1+two");
    }
}
