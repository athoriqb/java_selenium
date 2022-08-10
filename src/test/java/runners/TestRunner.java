package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = "@alami_test",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/alami-report.json"
        })
public class TestRunner {
}
