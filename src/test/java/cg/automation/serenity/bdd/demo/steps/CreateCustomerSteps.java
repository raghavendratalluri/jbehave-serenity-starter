package cg.automation.serenity.bdd.demo.steps;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;

import cg.automation.serenity.bdd.demo.pages.NewCustomerPage;

public class CreateCustomerSteps {

	protected NewCustomerPage newCustomerPage;

	@Step
	public void whenUserEntersAllCustomerData() {
		newCustomerPage.fillCustomerValues();
	}

	@Step
	public void whenUserEntersAllCustomerData(String customerName,
			String gender, String dob, String addr, String city, String state,
			String pin, String mobileNumber, String eMail, String passWord) {
		newCustomerPage.fillCustomerValues(customerName,gender,dob,addr,city,state,pin,mobileNumber,eMail,passWord);
	}

	@Step
	public void whenUserSaveCustomer() {
		newCustomerPage.saveCustomer();
	}

	public void thenUserShouldBeAbleToSeeCustomerRegisteredSuccessfully() {
		Assert.assertEquals("Customer Registered Successfully!!!",
				newCustomerPage.getCustomerRegisteredSuccessfullyTableHeading());
	}
}
