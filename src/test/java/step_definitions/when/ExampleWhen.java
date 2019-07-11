package step_definitions.when;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import test1.Pages;

public class ExampleWhen {
    public final Pages pages;

    public ExampleWhen(Pages pages) {this.pages = pages;}

    @When("^I add the numbers (\\d+) and (\\d+)$")
    public void enterTwoNumbers(String a, String b) {
        // Write code here that turns the phrase above into concrete actions
        pages.additionPage(Integer.valueOf(a), Integer.valueOf(b));
        System.out.println("This worked!");
    }

    @When("^I subtract the number (\\d+) from (\\d+)$")
    public void subtractTwoNumbers(String b, String a) {
        // Write code here that turns the phrase above into concrete actions
        pages.subtractionPage(Integer.valueOf(a), Integer.valueOf(b));
        System.out.println("This worked!");
    }

    @When("^I multiply the numbers (\\d+) and (\\d+)$")
    public void multiplyTwoNumbers(String a, String b) {
        // Write code here that turns the phrase above into concrete actions
        pages.multiplicationPage(Integer.valueOf(a), Integer.valueOf(b));
        System.out.println("This worked!");
    }

    @When("^I divide the number (\\d+) by (\\d+)$")
    public void divideTwoNumbers(String a, String b) {
        // Write code here that turns the phrase above into concrete actions
        pages.divisionPage(Integer.valueOf(a), Integer.valueOf(b));
        System.out.println("This worked!");
    }
}