package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAutomation {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.linkText("Find your account and log in.")).click();
		System.out.println(driver.getTitle());
	}

}
