package tests;
import org.junit.Rule;
import org.junit.Test;
import rules.CountAverageTimeOfTestsRule;
import java.io.IOException;

public class SimpleTest {

    @Rule
    public CountAverageTimeOfTestsRule countAverageTimeOfTestsRule = new CountAverageTimeOfTestsRule(3);

    public SimpleTest() throws IOException {
    }

    @Test
    public void basicTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test");
    }
}
