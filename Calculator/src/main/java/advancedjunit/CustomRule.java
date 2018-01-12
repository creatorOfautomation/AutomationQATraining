package advancedjunit;

import org.junit.Rule;
import org.junit.rules.*;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomRule implements TestRule {

    Date startDate;
    Date finishDate;


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    private TestWatcher testWatcher;


    private static final int DEFAULT_MAX_TRIES_COUNT = 1;
    private final int maxRunsCount;

    public CustomRule(final int maxRunsCount)
    {
        this.maxRunsCount = maxRunsCount > 0 ? maxRunsCount : DEFAULT_MAX_TRIES_COUNT;
    }

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Start date is " +startDate);
                setStartDate(new Date());
                Throwable testError = null;
                int runsCounter = 0;

                while (runsCounter < maxRunsCount) {
                    try {
                        base.evaluate();
                        return;
                    } catch (Throwable e) {
                        testError = e;
                        runsCounter++;
                    }
                }
                throw new AssertionError(String.format("Failed after %d attempts", maxRunsCount), testError);
            }
        };
    }

    public void sfds() {
        testWatcher = new TestWatcher() {
            @Override
            protected void starting(Description description) {

            }

            @Override
            protected void finished(Description description) {
                super.finished(description);
            }
        };
        System.out.println(startDate);
    }
}
