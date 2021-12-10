package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"stepDefinitions"},
        tags = ("@SanityTest"), monochrome = true, plugin = {"pretty",
        "json:target/cucumber.json","html:target/cucumberReport.html"})

public class SanityRunner {

}
