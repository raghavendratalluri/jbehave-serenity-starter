package cg.automation.serenity.bdd.demo.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class GoogleSearchStories {
	@Steps
	GoogleSearchSteps googleSearchSteps;

	@Given("user open google web site")
	public void givenUserOpenGoogleWebSite() {
		googleSearchSteps.givenUserOpenGoogleWebSite();
	}

	@When("user search for <topic>")
	public void whenUserSearchForTopic(@Named("topic") String topic) {
		googleSearchSteps.whenUserSearchForTopic(topic);
	}

	@Then("related content should be opened")
	public void thenRelatedContentShouldBeOpened() {
		googleSearchSteps.thenRelatedContentShouldBeOpened();
	}
}
