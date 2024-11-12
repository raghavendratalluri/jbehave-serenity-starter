package cg.automation.serenity.bdd.demo.steps;

import org.jbehave.core.annotations.Named;

import cg.automation.serenity.bdd.demo.pages.GooglePage;

public class GoogleSearchSteps {
	
	protected GooglePage googlePage;
	
	public void givenUserOpenGoogleWebSite() {
		googlePage.openGooglePage();
	}

	public void whenUserSearchForTopic(@Named("topic") String topic) {
		googlePage.enterSearchString(topic);
		googlePage.clickSearchButton();
	}

	public void thenRelatedContentShouldBeOpened() {
		googlePage.verifyRelatedTopicIsPresented();
	}
}
