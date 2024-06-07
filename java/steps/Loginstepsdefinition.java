package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepsdefinition extends BaseClass {

	@Given("Enter the credential username as {string} and password as {string}")
	public void entercredential(String uName, String pword) {
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pword);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}


	@Then("Home page should be displayed")
	public void homepagedisplayed() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("The Homepage is Verified");
		} else
			System.out.println("The Homepage is not verified");
	}

	@But("Errormessage should be displayed")
	public void Errormessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if(text.contains("Errors"))
		{
			System.out.println("The Error Message is verified");
		}
		else
		{
			System.out.println("The Error message is not verified");
		}
	}
}