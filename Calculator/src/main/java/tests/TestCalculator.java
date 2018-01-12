package tests;

import advancedjunit.CustomRule;
import com.exception.DivisionOnZeroException;
import com.exception.WrongFormatExpressionException;
import methods.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//@RunWith(Parameterized.class)
public class TestCalculator {

    public String expression;
    public int expectedResult;

  /*  @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {"2+2", 4},
                {"3-3", 0},
                {"5*5", 25},
                {"20/4", 5}
        });
    }*/

//    @Rule
    public CustomRule customRule = new CustomRule(2);

  //  @Test
    public void test() {
        Assert.fail();
    }

   /* @Test
    public void test() throws WrongFormatExpressionException, DivisionOnZeroException {

        assertThat(Calculator.evaluate(expression), equalTo(expectedResult));
    }*/
}
