package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Locate the Element
		WebElement Scroll = driver.findElement(By.linkText("Conditions of Use & Sale"));
		//Instantiate the Action
		Actions builder = new Actions(driver);
		builder.scrollToElement(Scroll).perform();
		System.out.println(Scroll.getText());
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Desktop./Test Leaf Selenium./img.jpg");
		FileUtils.copyFile(screenshotAs, des);
		System.out.println("Screenshot saved to the Path" +des);
		
	}

}
