package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import test1.Pages;

public class Hooks {
  public Pages pages = new Pages();
  @Before
  public void setup() {
    //Do scenario setup stuff here
  }

  @After
  public void tearDown(Scenario scenario) {

    if (scenario.isFailed()) {

    }
    //Do scenario teardown stuff here
  }
}
