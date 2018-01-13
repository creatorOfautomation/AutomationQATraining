package rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CountAverageTimeOfTestsRule implements TestRule {

    private static final int DEFAULT_COUNT = 1;
    private final int numberTestRunning;
    private Handler handler = new FileHandler("log/log.log");
    private Logger log = Logger.getLogger("Logs here");
    private SimpleFormatter simpleFormatter = new SimpleFormatter();

    public CountAverageTimeOfTestsRule(final int numberTestRunning) throws IOException {
        this.numberTestRunning = numberTestRunning > 0 ? numberTestRunning : DEFAULT_COUNT;
    }

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Calendar startTime = new GregorianCalendar();
                long lStartTime = startTime.getTime().getTime();
                handler.setFormatter(simpleFormatter);
                log.addHandler(handler);
                log.info("Test starts at: " + startTime.getTime());

                for (int i = 0; i < numberTestRunning; i++) {
                    base.evaluate();
                }
                Calendar finishTime = new GregorianCalendar();
                log.info("Test finished at: " + finishTime.getTime());
                long lFinishTime = finishTime.getTime().getTime();
                long result = (lFinishTime - lStartTime) / 1000 / numberTestRunning;
                String logMessage = "\"The average time of " + numberTestRunning + " tests is " + result + " sec\"";
                log.info(logMessage);
            }
        };
    }

}
