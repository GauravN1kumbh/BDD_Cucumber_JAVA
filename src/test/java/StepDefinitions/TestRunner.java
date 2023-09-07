package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinitions"},monochrome = true,
plugin = { "pretty", "html:target/HTMLReport/report.html","json:target/JSONReports/cucumber.json","junit:target/XMLReports/cucumber.xml"},tags="@smoketest_Login")

public class TestRunner {

}
