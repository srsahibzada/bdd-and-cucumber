package step_definitions.then;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import test1.Pages;

public class ExampleThen {
    private final Pages pages;

    public ExampleThen(Pages pages) {this.pages = pages;}

    @Then("^I receive output (\\d+)$")
    public void output(String result) throws Throwable {
        assert(pages.getPageResult().equals(Integer.valueOf(result)));
    }

    @Then("^division should fail")
    public void failedOutput() throws Throwable {
        assert(Pages.PAGE_TYPE.ERROR.equals(this.pages.getPageType()));
    }


}