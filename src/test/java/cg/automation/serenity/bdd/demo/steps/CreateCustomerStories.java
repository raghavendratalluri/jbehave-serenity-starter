package cg.automation.serenity.bdd.demo.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CreateCustomerStories {
	@Steps
	SerenityExSteps serenityExSteps;
	@Steps
	CreateCustomerSteps createCustomerSteps;

	@Given("<user> is in Add New Customer Page")
	public void givenuserIsInAddNewCustomerPage(@Named("user") String user) {
		serenityExSteps.givenuserIsInGuru99(user);
		serenityExSteps.whenUserSelectsNewCustomerLink();
	}

	@Then("user should be able to see Customer Registered Successfully")
	public void thenUserShouldBeAbleToSeeCustomerRegisteredSuccessfully() {
		createCustomerSteps
				.thenUserShouldBeAbleToSeeCustomerRegisteredSuccessfully();
	}

	@When("user enters all customer data")
	public void whenUserEntersAllCustomerData() {
		createCustomerSteps.whenUserEntersAllCustomerData();
	}

	@When("save the Customer")
	public void whenSaveTheCustomer() {
		createCustomerSteps.whenUserSaveCustomer();
	}

	@When("user enters <customerName>, <gender>, <dob>, <addr>, <city>, <state>, <pin>, <mobileNumber>, <eMail> and <passWord> values")
	public void whenUserEnterscustomerNamegenderdobaddrcitystatepinmobileNumbereMailAndpassWordValues(
			@Named("customerName") String customerName,
			@Named("gender") String gender, @Named("dob") String dob,
			@Named("addr") String addr, @Named("city") String city,
			@Named("state") String state, @Named("pin") String pin,
			@Named("mobileNumber") String mobileNumber,
			@Named("eMail") String eMail, @Named("passWord") String passWord) {
		createCustomerSteps.whenUserEntersAllCustomerData(customerName, gender,
				dob, addr, city, state, pin, mobileNumber, eMail, passWord);
	}
}