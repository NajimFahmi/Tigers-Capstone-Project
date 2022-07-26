package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	@Before
	
	public void beforeHooks (Scenario scenario) {
		logger.info("Secenario " + scenario.getName() + " Started");
		
		browser();
		openBrowser ();
	}
	@After 
	
	public void afterHooks(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test");
		
		}else {
			tearDown();
			logger.info("Scenario" + scenario.getName() + " " + scenario.getStatus());
		}
		
	}
	
}
