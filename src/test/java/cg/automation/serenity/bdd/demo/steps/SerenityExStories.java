package cg.automation.serenity.bdd.demo.steps;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
public class SerenityExStories{
	@Steps
	SerenityExSteps serenityExSteps;
	@Then("user should be able to see New Customer Page")
	public void thenUserShouldBeAbleToNewCustomerPage(){
		serenityExSteps.thenUserShouldBeAbleToSeeNewCustomerPage();
	}
	@Given("<user> is in Guru99")
	public void givenuserIsInGuru99(@Named("user") String user){
		serenityExSteps.givenuserIsInGuru99(user);
	}
	@When("user selects New Customer Link")
	public void whenUserSelectsNewCustomerLink(){
		serenityExSteps.whenUserSelectsNewCustomerLink();
	}
}