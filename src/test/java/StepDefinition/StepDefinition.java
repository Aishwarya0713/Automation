package StepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on a landing page$")
    public void user_is_on_a_landing_page() throws Throwable {
        System.out.println("Navigated to landing page");
    }

    @When("^User login to the application by entering valid \"([^\"]*)\" and \"([^\"]*)\" password$")
    public void user_login_to_the_application_by_entering_valid_something_and_something_password(String strArg1, String strArg2) throws Throwable {
    	 System.out.println("Navigated to the Home page");
    	 System.out.println(strArg1);
    	 System.out.println(strArg2);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	 System.out.println("Validate the Home page");
    }

    @And("^Username is displayed \"([^\"]*)\"$")
    public void username_is_displayed_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }
}
