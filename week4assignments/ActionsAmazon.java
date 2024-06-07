package week4assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {
	
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Search for "one plus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		//Get the price of the first product
		WebElement Price = driver.findElement(By.xpath("(//span[contains(@class, 'a-price-whole')])[3]"));
		String singleprice = Price.getText(); 
		System.out.println("Price of the first product: " + singleprice);
		
		//Print the number of customer ratings for the first displayed product
		WebElement Ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		String rate = Ratings.getText();
		System.out.println("Number of customer ratings: " + rate);
		
		//Click the first text link of the first image.
		driver.findElement(By.xpath("(//img[@class='s-image s-image-optimized-rendering'])[1]")).click();
		
		//Take a screenshot of the product displayed.
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Desktop./Test Leaf Selenium./image1.jpg");
		FileUtils.copyFile(screenshot, des);
		System.out.println("Screenshot saved to the Path" +des);
		
		//Click the 'Add to Cart' button.
		//get all the window handles ==> convert set in to List
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> List = new ArrayList<>(windowHandles);
		driver.switchTo().window(List.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//Get the cart subtotal and verify if it is correct.
		WebElement subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String CartTotal = subtotal.getText();
		System.out.println("Cart subtotal: " + CartTotal);
		
		
	}

}
