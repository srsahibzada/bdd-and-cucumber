import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
  features = {"src/main/resources/features"},
  plugin = {"pretty", "html:target/cucumber_reports", "json:target/cucumber.json"},
        tags = {"@DivideByZero"}
)
public class MainTest extends AbstractTestNGCucumberTests {
  //This is meant to be empty.  It just declares that cucumber is running with TestNG
}
