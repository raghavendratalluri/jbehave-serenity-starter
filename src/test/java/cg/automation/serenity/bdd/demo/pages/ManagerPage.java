package cg.automation.serenity.bdd.demo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class ManagerPage extends PageObject{

	private static final String NEW_CUSTOMER = "New Customer";
	
	@FindBy(linkText = NEW_CUSTOMER)
	WebElement newCustomerLink;
	
	public void clickOnNewCustomerLink() {
		newCustomerLink.click();
	}
}
