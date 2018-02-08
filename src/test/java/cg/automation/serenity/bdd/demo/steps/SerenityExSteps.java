package cg.automation.serenity.bdd.demo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.annotations.Named;
import org.junit.Assert;

import cg.automation.serenity.bdd.demo.pages.LoginPage;
import cg.automation.serenity.bdd.demo.pages.ManagerPage;
import cg.automation.serenity.bdd.demo.pages.NewCustomerPage;

@SuppressWarnings("serial")
public class SerenityExSteps extends ScenarioSteps {

	protected LoginPage loginPage;
	protected ManagerPage managerPage;
	protected NewCustomerPage newCustomerPage;

	@Step
	public void thenUserShouldBeAbleToSeeNewCustomerPage() {
		Assert.assertEquals("Guru99 Bank New Customer Entry Page", getDriver().getTitle());
	}

	@Step
	public void givenuserIsInGuru99(@Named("user") String user) {
		loginPage.openGuru99LoginPage();
		loginPage.enterUserID(user);
		loginPage.enterPassWord(null);
		loginPage.clickLoginBtn();
	}

	@Step
	public void whenUserSelectsNewCustomerLink() {
		managerPage.clickOnNewCustomerLink();
	}
}
