package week3.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePrice {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);

		List<WebElement> Pricename = driver.findElements(By.className("a-price-whole"));
		List<String> Price =new ArrayList<>();
		for(WebElement each : Pricename)
		{
			String text =each.getText();
			System.out.println(text);
			Price.add(text);
		}

		Collections.sort(Price);
		System.out.println("The lowest price is:" +Price.get(0));
	}

}
