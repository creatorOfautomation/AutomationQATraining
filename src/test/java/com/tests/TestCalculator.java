package com.tests;

import com.exception.DivisionOnZeroException;
import com.exception.WrongFormatExpressionException;
import methods.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class TestCalculator {

    public String expression;
    public int expectedResult;

    public TestCalculator(final String expression, final int expectedResult) {
        this.expression = expression;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {"2+2", 4},
                {"3-3", 0},
                {"5*5", 25},
                {"20/4", 5}
        });
    }

    @Test
    public void test() throws WrongFormatExpressionException, DivisionOnZeroException {
        assertThat(Calculator.evaluate(expression), equalTo(expectedResult));
    }
}
