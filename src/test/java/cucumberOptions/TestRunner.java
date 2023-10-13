package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",tags="@Login",
                  glue="stepDefinitions",
                  monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {

	

}
