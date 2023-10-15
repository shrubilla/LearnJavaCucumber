package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",tags="@Search or @Filter",
                  glue="stepDefinitions",plugin = { "pretty","html:target/cucumber-reports" },
                  monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {

	

}
