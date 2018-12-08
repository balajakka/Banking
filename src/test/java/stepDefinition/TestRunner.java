package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="./src/test/java/features",
        glue={"stepDefinition"},
        format = {"json:target/cucumber.json" +
                ""}
)
public class TestRunner {
}
