package test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(
        features = "src/resources/features/",
        glue = { "test.stepDefs" },
        tags = { "@suite" },
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class RunSuite {

}
