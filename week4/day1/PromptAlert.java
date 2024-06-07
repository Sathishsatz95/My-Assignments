package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//switch the driver focus to the alert
	    Alert promptalert = driver.switchTo().alert();
	    //Given the name
		promptalert.sendKeys("Sathish");
		//read the text of the alert
		String alertmsg = promptalert.getText();
		System.out.println("Alert Msg:" +alertmsg);
		promptalert.accept();
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		//driver.close();
		
	}

}
