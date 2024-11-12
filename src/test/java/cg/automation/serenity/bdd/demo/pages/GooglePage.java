package cg.automation.serenity.bdd.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class GooglePage extends PageObject{

	private static final String SEARCH_INPUT_BOX = "//textarea[@title='Search']";
	private static final String SEARCH_BUTTON = "//input[@value='Google Search']";
	private static final String RELATED_TOPIC = "//div[@id='rcnt']";
	
	@FindBy(xpath = SEARCH_INPUT_BOX)
	WebElement searchInput;
	@FindBy(xpath = SEARCH_BUTTON)
	WebElement searchButton;
	@FindBy(xpath = RELATED_TOPIC)
	WebElement relatedTopic;
	
	public void openGooglePage() {
		open();
		getDriver().manage().window().maximize();
	}
	
	public void enterSearchString(String topic) {
		this.searchInput.sendKeys(topic);
	}
	
	public void clickSearchButton() {
		this.searchButton.click();
	}
	
	public void verifyRelatedTopicIsPresented() {
		Assert.assertTrue(relatedTopic.isDisplayed());
	}
}
