package JSON;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", plugin = {"pretty", "io.cucumber.pro.JsonReporter:all"})
public class RunJSONComparisonTest {
}
