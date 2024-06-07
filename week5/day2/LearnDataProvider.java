package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.CreateLead;

public class LearnDataProvider extends BaseClass{

	@DataProvider(name="fetchdata")
	public String[][] data() {
		String [] [] sk=new String[2][3];
		sk [0][0]="sathish";
		sk [0][1]="kumar";
		sk[0][2]="kumaresan";
		
		sk[1][0]="karthiga";
		sk[1][1]="D";
		sk[1][2]="dayalan";
		
		return sk;

	}
	
	@Test(dataProvider="fetchdata")
	public void createlead(String firstname, String lastname, String companyname) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
	}

}
