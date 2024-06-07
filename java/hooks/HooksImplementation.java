package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class HooksImplementation extends BaseClass{
	
	@Before
	public void precondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@After
	public void postcondition() {
		driver.close();

	}

}
