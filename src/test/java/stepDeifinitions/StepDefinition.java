package stepDeifinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on Netbanking Landing Page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       
    	//code to navigate to Login URL
    	
    	System.out.println("Navigated to Login Page");
    }

    @When("^User login into application with username & password$")
    public void user_login_into_application_with_username_password() throws Throwable {
       // Code to Login
    	
    	System.out.println("Login Happened");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       //Home page validation
    	
    	System.out.println("Home page validated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        // Validating the cards
    	
    	System.out.println("Cards validated");
    }

}