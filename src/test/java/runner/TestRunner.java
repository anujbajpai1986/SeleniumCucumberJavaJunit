package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        plugin = "html:target/cucumber-report.html",
        glue = {"stepDefinitions", "runner" },
        tags = "@LoginTest"
)
public class TestRunner {
}
