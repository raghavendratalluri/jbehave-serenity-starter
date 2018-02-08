package cg.automation.serenity.bdd.demo;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTests extends SerenityStories {

	public AcceptanceTests() {
//		System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("phantomjs.binary.path", "src/test/resources/drivers/phantomjs.exe");
	}
}
