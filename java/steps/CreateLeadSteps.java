package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass {

	@When("click on the crmsfa link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("click on the CreateLead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyname as (.*)$")
	public void enter_the_company_name(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	@When("Enter the firstname (.*)$")
	public void enter_the_firstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@When("Enter the lastname as (.*)$")
	public void enter_the_lastname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("click on the submit Button")
	public void click_on_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Viewleads page should be displayed as (.*)$")
	public void viewleads_page_should_be_displayed(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}	
}
